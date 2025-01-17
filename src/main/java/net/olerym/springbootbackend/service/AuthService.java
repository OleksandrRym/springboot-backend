package net.olerym.springbootbackend.service;

import net.olerym.springbootbackend.DTO.JwtUtil;
import net.olerym.springbootbackend.model.User;
import net.olerym.springbootbackend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AuthService {

    private final UserRepo userRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    public AuthService(UserRepo userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public Optional<Map<String, String>> authenticate(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            Map<String, String> tokens = new HashMap<>();
            tokens.put("access_token", jwtUtil.generateAccessToken(username));
            tokens.put("refresh_token", jwtUtil.generateRefreshToken(username));
            return Optional.of(tokens);
        }
        return Optional.empty();
    }
}
