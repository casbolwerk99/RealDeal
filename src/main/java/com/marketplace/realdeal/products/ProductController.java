package com.marketplace.realdeal.products;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.realdeal.products.dto.ProductRequest;
import com.marketplace.realdeal.users.User;
import com.marketplace.realdeal.users.interfaces.UserRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductRepository productRepository;
  private final UserRepository userRepository;

  public ProductController(ProductRepository productRepository, UserRepository userRepository) {
    this.productRepository = productRepository;
    this.userRepository = userRepository;
  }

  @GetMapping
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @PostMapping
  public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
    User user = userRepository.findById(productRequest.getUserId())
            .orElseThrow(() -> new RuntimeException("User not found"));

    Product product = new Product();
    product.setName(productRequest.getName());
    product.setPrice(productRequest.getPrice());
    product.setUser(user);

    Product savedProduct = productRepository.save(product);
    return ResponseEntity.ok(savedProduct);
  }
}
