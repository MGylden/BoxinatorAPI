package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Shipments;
import com.example.demo.models.Users;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping(path = "/api/v1/")
public class UsersController {
	
	@Autowired
	private UserRepository userRepository;
	private ShipmentRepository shipmentRepository;
	
	@GetMapping("users")
	public List<Users> getAllUsers() {
		return this.userRepository.findAll();
	}
	
	@GetMapping("shipments")
	public List<Shipments> getAllShipments() {
		return this.shipmentRepository.findAll();
	}
	
	
	
	}
	
	
}

	
	
	
	
	
	
	
	
	/*@GetMapping("/hello") // GET: localhost:8080/api/v1/test/1
	public ResponseEntity<String> path(@RequestParam String first_name) {
		return ResponseEntity.ok().body(String.valueOf(first_name));
	}

	// Extracting a query string
	@GetMapping // GET: localhost:8080/api/v1/test?key=value
	public ResponseEntity<String> query(@RequestParam String first_name) {
		return ResponseEntity.ok().body(first_name);
	}

	// Extracts the User-Agent header
	@GetMapping("header") // GET: localhost:8080/api/v1/header
	public ResponseEntity<String> headers(@RequestHeader("User-Agent") String agent) {
		return ResponseEntity.ok().body(agent);
	}

	// Extracts the body
	@GetMapping("body") // GET: localhost:8080/api/v1/body
	public ResponseEntity<String> body(@RequestBody String value) {
		return ResponseEntity.ok().body(value);
	}
}*/
