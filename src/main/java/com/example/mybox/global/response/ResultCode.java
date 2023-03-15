package com.example.mybox.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {

    // user
    USER_CREATE_SUCCESS("U001", "사용자 생성 성공"),
    GET_USER_SUCCESS("U002", "사용자 조회 성공");

    private final String code;
    private final String message;
}
