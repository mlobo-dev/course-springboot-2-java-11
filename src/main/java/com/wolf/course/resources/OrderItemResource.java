package com.wolf.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolf.course.entities.OrderItem;
import com.wolf.course.services.OrderItemService;

@RestController
@RequestMapping(value = "/orderitems")
public class OrderItemResource {

	@Autowired
	private OrderItemService service;

	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll() {
		List<OrderItem> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
		OrderItem orderItem = service.findById(id);
		return ResponseEntity.ok().body(orderItem);
	}
}
