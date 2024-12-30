package com.marketplace.realdeal.users;

import com.marketplace.realdeal.users.dto.UserToCreateDto;
import com.marketplace.realdeal.users.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid UserToCreateDto userToCreate) {
        return ResponseEntity.ok(userService.createUser(userToCreate));
    }
}
