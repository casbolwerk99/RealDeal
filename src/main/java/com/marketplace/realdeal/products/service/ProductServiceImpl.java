package com.marketplace.realdeal.products.service;

import java.util.List;

import com.marketplace.realdeal.products.Product;
import com.marketplace.realdeal.products.dto.ProductToCreateDto;
import com.marketplace.realdeal.products.interfaces.ProductMapper;
import com.marketplace.realdeal.products.interfaces.ProductRepository;
import com.marketplace.realdeal.users.User;
import org.springframework.stereotype.Service;

import com.marketplace.realdeal.users.dto.UserToCreateDto;
import com.marketplace.realdeal.users.interfaces.UserMapper;
import com.marketplace.realdeal.users.interfaces.UserRepository;
import com.marketplace.realdeal.users.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final UserRepository userRepository;
  private final ProductMapper productMapper;

  public Product createProduct(ProductToCreateDto productToCreate) {
    User user = userRepository.findById(productToCreate.getUserId())
            .orElseThrow(() -> new RuntimeException("User not found"));

//    Product product = new Product();
//    product.setName(productToCreate.getName());
//    product.setPrice(productToCreate.getPrice());
//    product.setUser(user);

    var product = productMapper.productToCreateToProduct(productToCreate);

    return productRepository.save(product);
  }

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

}
