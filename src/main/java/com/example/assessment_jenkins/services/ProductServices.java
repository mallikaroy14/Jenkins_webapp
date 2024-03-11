package com.example.assessment_jenkins.services;

import com.example.assessment_jenkins.models.Products;
import com.example.assessment_jenkins.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public Products create(Products products){
        Products newProducts = productRepository.save(products);
        return newProducts;
    }

    public List<Products> get(){
        List<Products> products = productRepository.findAll();
        return products;
    }
}
