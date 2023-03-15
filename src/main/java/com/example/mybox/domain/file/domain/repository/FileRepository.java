package com.example.mybox.domain.file.domain.repository;

import com.example.mybox.domain.file.domain.entity.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Files, Long> {

}
