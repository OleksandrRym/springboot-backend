package net.olerym.springbootbackend.controller;


import lombok.RequiredArgsConstructor;
import net.olerym.springbootbackend.DTO.AuthRequest;
import net.olerym.springbootbackend.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/pp")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<?> auth(@RequestBody AuthRequest authRequest) {
        return authService.authenticate(authRequest.getUsername(), authRequest.getPassword())
                .map(tokens -> ResponseEntity.ok().body(tokens))
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(Map.of("error", "Invalid login or password")));
    }
}
