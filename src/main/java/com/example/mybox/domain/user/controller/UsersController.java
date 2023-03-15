package com.example.mybox.domain.user.controller;

import com.example.mybox.domain.user.dto.UsersCreateRequest;
import com.example.mybox.domain.user.dto.UsersInfo;
import com.example.mybox.domain.user.service.UsersLoginService;
import com.example.mybox.global.response.ResultCode;
import com.example.mybox.global.response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UsersController {

    @Autowired
    private UsersLoginService usersLoginService;

    @PostMapping("/api/v1/users/register")
    public ResponseEntity<ResultResponse> registerUsers(@RequestBody UsersCreateRequest request) {
        UsersInfo usersInfo = usersLoginService.registerUser(request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.USER_CREATE_SUCCESS, usersInfo));
    }

    @GetMapping("/api/v1/users/{id}")
    public ResponseEntity<ResultResponse> getUsers(@PathVariable Long id) {
        UsersInfo usersInfo = usersLoginService.findOneUsersById(id);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.GET_USER_SUCCESS, usersInfo));
    }
}
