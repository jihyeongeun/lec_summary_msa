package com.ohgiraffers.usersevice.dto;

import com.ohgiraffers.usersevice.vo.ResponseOrder;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String pwd;
    private String userId;
    private java.util.Date enrollDate;

    /* 설명. FeignClient 이후 */
    private List<ResponseOrder> orders;
}
