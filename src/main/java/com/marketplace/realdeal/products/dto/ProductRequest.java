package com.marketplace.realdeal.products.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
  private String name;
  private double price;
  private Long userId;
}
