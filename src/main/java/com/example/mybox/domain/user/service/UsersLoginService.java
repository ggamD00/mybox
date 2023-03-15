package com.example.mybox.domain.user.service;

import com.example.mybox.domain.user.domain.entity.Users;
import com.example.mybox.domain.user.domain.repository.UsersRepository;
import com.example.mybox.domain.user.dto.UsersCreateRequest;
import com.example.mybox.domain.user.dto.UsersInfo;
import com.example.mybox.domain.user.exception.NotFoundUserEntityException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersLoginService {

    private final UsersRepository usersRepository;

    public Users findLoginUsersById(Long id) {
        return usersRepository.findUsersById(id).orElseThrow(NotFoundUserEntityException::new);
    }

    public UsersInfo findOneUsersById(Long id) {
        Users foundUsers =
                usersRepository.findUsersById(id).orElseThrow(NotFoundUserEntityException::new);
        return mapUserToUserInfo(foundUsers);
    }

    public UsersInfo registerUser(UsersCreateRequest usersCreateRequest) {
        Users newUsers =
                Users.builder()
                        .name(usersCreateRequest.getName())
                        .email(usersCreateRequest.getEmail())
                        .loginId(usersCreateRequest.getLoginId())
                        .password(usersCreateRequest.getPassword())
                        .build();
        newUsers = usersRepository.save(newUsers);
        return mapUserToUserInfo(newUsers);
    }

    private static UsersInfo mapUserToUserInfo(Users foundUsers) {
        return UsersInfo.builder()
                .name(foundUsers.getName())
                .email(foundUsers.getEmail())
                .build();
    }
}
