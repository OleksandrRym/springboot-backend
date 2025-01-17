package net.olerym.springbootbackend.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import net.olerym.springbootbackend.DTO.JwtUtil;
import net.olerym.springbootbackend.DTO.UserDTO;
import net.olerym.springbootbackend.model.User;
import net.olerym.springbootbackend.repository.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pp")
@RequiredArgsConstructor
public class UserController {
    private final UserRepo userRepo;
    private final JwtUtil jwtUtil;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/me")
    public ResponseEntity<UserDTO> getUserInfo(@RequestHeader("Authorization") String authorizationHeader) {
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        try {
            String token = authorizationHeader.substring(7);
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(JwtUtil.SECRET_KEY)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            String username = claims.getSubject();

            return userRepo.findByUsername(username)
                    .map(user -> ResponseEntity.ok(new UserDTO(user))) // Передаємо User у конструктор UserDTO
                    .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}

