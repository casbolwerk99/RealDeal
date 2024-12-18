package com.marketplace.realdeal.users.interfaces;

import java.util.List;

import com.marketplace.realdeal.users.User;
import com.marketplace.realdeal.users.dto.UserToCreateDto;

public interface UserService {
    List<User> getAllUsers();
    User createUser(UserToCreateDto userToCreate);
}
