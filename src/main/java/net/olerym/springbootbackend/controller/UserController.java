package net.olerym.springbootbackend.controller;

import lombok.RequiredArgsConstructor;

import net.olerym.springbootbackend.model.User;
import net.olerym.springbootbackend.repository.UserRepo;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserRepo userRepo;
    @GetMapping("/employees")
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
