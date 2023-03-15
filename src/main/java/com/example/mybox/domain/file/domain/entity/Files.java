package com.example.mybox.domain.file.domain.entity;

import com.example.mybox.domain.folder.domain.entity.Folders;
import com.example.mybox.global.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "files")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Files extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folders_id")
    private Folders folders;

    @Column(nullable = false)
    private Long volume;
}
