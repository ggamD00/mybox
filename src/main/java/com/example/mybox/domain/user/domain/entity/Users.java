package com.example.mybox.domain.user.domain.entity;

import com.example.mybox.domain.folder.domain.entity.Folders;
import com.example.mybox.global.domain.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Folders> folders = new ArrayList<>();

    @Column(name = "login_id", length = 30, nullable = false, unique = true)
    private String loginId;

    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 30, nullable = false)
    private String name;

    @Email(message = "이메일 형식으로 입력해주세요.")
    @Column(length = 50, nullable = false, unique = true)
    private String email;

}
