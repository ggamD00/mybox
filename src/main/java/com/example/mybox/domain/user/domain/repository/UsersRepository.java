package com.example.mybox.domain.user.domain.repository;

import com.example.mybox.domain.user.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    @Query(value = "select u from Users u where u.id= :id")
    Optional<Users> findUsersById(@Param("id") Long id);
}
