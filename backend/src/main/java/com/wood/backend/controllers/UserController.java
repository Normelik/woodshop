package com.wood.backend.controllers;

import com.wood.backend.DTOs.RegisterRequestUserDTO;
import com.wood.backend.DTOs.RegisterResponseUserDTO;
import com.wood.backend.services.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    String healthEndpoint() {
        return "User level access";
    }


    @PostMapping("/register")
    ResponseEntity<RegisterResponseUserDTO> registerUser(@RequestBody RegisterRequestUserDTO newUser) {
        return new ResponseEntity<>(userServiceImpl.registerUser(newUser), HttpStatus.CREATED);
    }
}
