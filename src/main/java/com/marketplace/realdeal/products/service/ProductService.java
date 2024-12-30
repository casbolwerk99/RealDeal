package com.marketplace.realdeal.products.service;

import com.marketplace.realdeal.products.Product;
import com.marketplace.realdeal.products.dto.ProductToCreateDto;

import java.util.List;

public interface ProductService {
  List<Product> getAllProducts();
  Product createProduct(ProductToCreateDto productToCreate);
}
