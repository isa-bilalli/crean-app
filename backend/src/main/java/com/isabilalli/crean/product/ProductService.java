package com.isabilalli.crean.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository ProductRepository){
        this.productRepository=ProductRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> findByName(String name){
        return productRepository.findByName(name);
    }

}
