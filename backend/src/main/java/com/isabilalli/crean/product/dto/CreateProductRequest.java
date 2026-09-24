package com.isabilalli.crean.product.dto;

import java.math.BigDecimal;

public class CreateProductRequest {
    private String name;
    private BigDecimal price;
    private String desc;

    public  CreateProductRequest(){
        
    }

    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getDesc(){
        return desc;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(BigDecimal price){
        this.price=price;
    }

    public void setDesc(String desc){
        this.desc=desc;
    }
}
