package com.wood.backend.services;

import com.wood.backend.DTOs.RegisterRequestUserDTO;
import com.wood.backend.DTOs.RegisterResponseUserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterResponseUserDTO registerUser(RegisterRequestUserDTO registerRequestUserDTO);
}
