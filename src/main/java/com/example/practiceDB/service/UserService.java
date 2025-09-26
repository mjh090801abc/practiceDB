package com.example.practiceDB.service;

import com.example.practiceDB.entity.User;
import com.example.practiceDB.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("이미 사용중인 아이디입니다.");
        }

        return userRepository.save(user);
    }

}
