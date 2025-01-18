package com.marketplace.realdeal.products;

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

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private double price;

  @ManyToOne()
//  @JsonIgnore
  private User user;
}
