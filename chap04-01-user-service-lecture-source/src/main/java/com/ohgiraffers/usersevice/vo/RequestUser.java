package com.ohgiraffers.usersevice.vo;

import lombok.Data;

/* 설명. 회원가입을 위해 넘어온 사용자 정보를 받아줄 Command 객체용 VO 생성 */
@Data           // constructor, getter,setter, toString 한번에 적용
public class RequestUser {
    private String name;
    private String email;
    private String pwd;
}
