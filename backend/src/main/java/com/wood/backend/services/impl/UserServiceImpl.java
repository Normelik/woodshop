package com.wood.backend.services.impl;

import com.wood.backend.DTOs.RegisterRequestUserDTO;
import com.wood.backend.DTOs.RegisterResponseUserDTO;
import com.wood.backend.repositories.UserRepository;
import com.wood.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public RegisterResponseUserDTO registerUser(@RequestBody RegisterRequestUserDTO registerRequestUserDTO) {

        if(userRepository.existsByUsername(registerRequestUserDTO.username())){
            throw new UsernameNotFoundException("Username already exists");
        }
        return new RegisterResponseUserDTO("I am a new user");
    }


}
