package com.example.mybox.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersCreateRequest {
    private String name;
    private String email;
    private String loginId;
    private String password;
}

