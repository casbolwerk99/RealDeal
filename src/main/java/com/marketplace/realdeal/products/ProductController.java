package com.marketplace.realdeal.products;

import com.marketplace.realdeal.products.dto.ProductToCreateDto;
import com.marketplace.realdeal.products.interfaces.ProductRepository;
import com.marketplace.realdeal.products.service.ProductService;
import com.marketplace.realdeal.users.User;
import com.marketplace.realdeal.users.interfaces.UserRepository;
import com.marketplace.realdeal.users.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;
  private final ProductRepository productRepository;
  private final UserRepository userRepository;

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts() ;
  }

  @PostMapping
  public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductToCreateDto productToCreate) {
    return ResponseEntity.ok(productService.createProduct(productToCreate));
  }
}
