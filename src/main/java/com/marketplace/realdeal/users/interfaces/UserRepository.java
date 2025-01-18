package com.marketplace.realdeal.users.interfaces;

import com.marketplace.realdeal.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
