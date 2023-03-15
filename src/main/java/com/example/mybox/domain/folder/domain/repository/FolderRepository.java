package com.example.mybox.domain.folder.domain.repository;

import com.example.mybox.domain.folder.domain.entity.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders, Long> {
}
