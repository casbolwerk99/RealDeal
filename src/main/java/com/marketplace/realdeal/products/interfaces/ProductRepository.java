package com.marketplace.realdeal.products.interfaces;

import com.marketplace.realdeal.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
