package com.isabilalli.crean.product;

import java.util.List;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(BigDecimal price);
    void deleteByPriceGreaterThan(BigDecimal price);
}
