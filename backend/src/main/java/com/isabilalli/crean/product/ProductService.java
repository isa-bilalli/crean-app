package com.isabilalli.crean.product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.isabilalli.crean.product.dto.*;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    private ProductResponse toResponse(Product product){
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }

    public ProductService(ProductRepository ProductRepository){
        this.productRepository=ProductRepository;
    }

    public ProductResponse createProduct(CreateProductRequest request){
        Product product = new Product(
            request.getName(),
            request.getPrice(),
            request.getDesc()
        );
        Product savedProduct = productRepository.save(product);
        return toResponse(savedProduct);
    }

    public List<ProductResponse> getAllProducts(){
        return productRepository.findAll().stream().map(this::toResponse).toList();
    }

    public Optional<ProductResponse> findByName(String name){
        return productRepository.findByName(name).map(this::toResponse);
    }

    public Optional<ProductResponse> findById(Long id){
        return productRepository.findById(id).map(this::toResponse);
    }

    public List<ProductResponse> getPriceGreaterThan(BigDecimal price){
        return productRepository.findByPriceGreaterThan(price).stream().map(this::toResponse).toList();
    }

    public boolean deleteByPriceGreaterThan(BigDecimal price){
        return productRepository.deleteByPriceGreaterThan(price);
    }
}
