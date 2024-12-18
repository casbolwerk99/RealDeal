package com.marketplace.realdeal.users;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marketplace.realdeal.users.dto.UserToCreateDto;
import com.marketplace.realdeal.users.interfaces.UserMapper;
import com.marketplace.realdeal.users.interfaces.UserRepository;
import com.marketplace.realdeal.users.interfaces.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User createUser(UserToCreateDto userToCreate) {
        var userEmail = userToCreate.getEmail();
        if (userRepository.existsByEmail(userEmail)) {
            throw new IllegalArgumentException("User with email " + userEmail + " already exists");
        }

        var user = userMapper.userToCreateToUser(userToCreate);

        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
