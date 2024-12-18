package com.marketplace.realdeal.users.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.realdeal.users.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
