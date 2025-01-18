package com.marketplace.realdeal.users.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UserToCreateDto {
    @NotEmpty(message = "Name is required")
    @Length(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;
}
