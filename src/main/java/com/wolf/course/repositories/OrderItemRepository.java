package com.wolf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolf.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
