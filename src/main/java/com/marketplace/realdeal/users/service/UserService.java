package com.marketplace.realdeal.users.service;

import com.marketplace.realdeal.users.User;
import com.marketplace.realdeal.users.dto.UserToCreateDto;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(UserToCreateDto userToCreate);
}
