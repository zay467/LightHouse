package com.zayminmaw.lighthouse.entity.response;

import lombok.Data;

@Data
public class LoginResponse extends Response{
    private String email;
    private String token;
}
