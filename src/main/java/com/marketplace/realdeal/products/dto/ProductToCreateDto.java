package com.marketplace.realdeal.products.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class ProductToCreateDto {
  @NotEmpty(message = "Name is required")
  @Length(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
  private String name;

  @Min(value = 0, message = "Price must be greater than or equal to 0")
  @Digits(integer = 10, fraction = 2, message = "Price must be a valid monetary amount with up to two decimal places")
  private double price;

  @NotNull(message = "User ID is required")
  @Positive(message = "User ID must be a positive number")
  private Long userId;
}
