package com.wolf.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolf.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User>	findAll(){
		User u = new User(1L,"Mary","mary@mail","99999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
