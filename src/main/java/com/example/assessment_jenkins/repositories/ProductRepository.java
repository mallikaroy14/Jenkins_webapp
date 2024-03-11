package com.example.assessment_jenkins.repositories;

import com.example.assessment_jenkins.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
