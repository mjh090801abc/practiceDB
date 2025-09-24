package com.example.practiceDB.repository;

import com.example.practiceDB.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Integer, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String username);
}
