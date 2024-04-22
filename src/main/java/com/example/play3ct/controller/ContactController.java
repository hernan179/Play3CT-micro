package com.example.play3ct.controller;


import com.example.play3ct.model.Person;
import com.example.play3ct.service.ContactService;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactService contactService;

	@PostMapping("/save")
	public ResponseEntity<Person> save(@RequestBody Person person) {
		Person saved = contactService.save(person);  
		return new ResponseEntity( saved, HttpStatus.CREATED);
	}

	@GetMapping("/retrieve/{id}")
	public ResponseEntity<Person> retrieve(@PathVariable("id") Integer id) {
		Person person = contactService.retrieve(id);
		return new ResponseEntity(person, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ping", 
			  produces = "application/json", 
			  method=RequestMethod.GET)
	public ResponseEntity<Person> ping() {
		Person person = new Person();
		
		person.setId(1268);
		person.setMobile("2314215");
		person.setName("HSA");
		
		return new ResponseEntity(person, HttpStatus.OK);
	}
}
