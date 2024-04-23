package com.you4me.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Product {
    
    @Id
    private Long id;
    private String productName;

    // Constructors, getters, and setters


    public Product(Long id, String name) {
        this.id = id;
        this.productName = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + productName + '\'' +
                '}';
    }
}
