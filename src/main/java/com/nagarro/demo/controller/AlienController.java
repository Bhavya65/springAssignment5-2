package com.nagarro.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.demo.dao.AlienRepo;
import com.nagarro.demo.model.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
		
	@DeleteMapping("/employee/{employeeCode}")
	public String deleteEmployee(@PathVariable("employeeCode") int employeeCode) {
		Alien alien = repo.getOne(employeeCode);
		repo.delete(alien);
		return "Deleted Successfully";
	}
	
	@PostMapping("/employee")
	public Alien add(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@PutMapping("/employee")
	public Alien updateOrSave(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@GetMapping("/employees")
	public List<Alien> employees() {
		return repo.findAll();
	}
	
	@GetMapping("/employee/{employeeCode}")
	public Optional<Alien> employees(@PathVariable("employeeCode") int employeeCode) {
		return repo.findById(employeeCode);
	}
}