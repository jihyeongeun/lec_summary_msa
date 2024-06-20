package com.ohgiraffers.usersevice.service;

import com.ohgiraffers.usersevice.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void registUser(UserDTO userDTO);

    UserDTO getUserDetailsByEmail(String email);

    UserDTO getUserById(String id);
}
