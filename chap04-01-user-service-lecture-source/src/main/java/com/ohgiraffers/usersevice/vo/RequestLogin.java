package com.ohgiraffers.usersevice.vo;

import lombok.Data;

@Data
public class RequestLogin {
    private String email;
    private String password;
}
