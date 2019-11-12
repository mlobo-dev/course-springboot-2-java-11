package com.wolf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolf.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
