package com.tripcatcher.tripcatcherbackend.domain.repository.userRepository;

import com.tripcatcher.tripcatcherbackend.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByUserId(String userId);
}