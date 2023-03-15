package com.example.mybox.domain.folder.domain.entity;

import com.example.mybox.domain.file.domain.entity.Files;
import com.example.mybox.domain.user.domain.entity.Users;
import com.example.mybox.global.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Folders extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "folders", cascade = CascadeType.ALL)
    private List<Files> files = new ArrayList<>();

    @Column(nullable = false)
    private Long volume;
}
