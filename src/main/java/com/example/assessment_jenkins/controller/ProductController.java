package com.example.assessment_jenkins.controller;

import com.example.assessment_jenkins.models.Products;
import com.example.assessment_jenkins.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping("/")
    public List<Products> getAll(){
        return productServices.get();
    }

    @PostMapping("/")
    public Products createProducts(@RequestBody Products products){
       return productServices.create(products);
    }

}
