package com.wolf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolf.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
