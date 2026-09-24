package com.isabilalli.crean.product;

import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

    Optional<Product> findByName(String name);
    
    List<Product> findByPriceGreaterThan(BigDecimal price);
    boolean deleteByPriceGreaterThan(BigDecimal price);
}
