package com.marketplace.realdeal.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marketplace.realdeal.users.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private double price;

  @ManyToOne()
  @JoinColumn(name = "user_id", nullable = false)
  @JsonIgnore
  private User user;
}
