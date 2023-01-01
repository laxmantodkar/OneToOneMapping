package com.mappings.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.entities.Manager;
import com.mappings.repository.ManagerRepository;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerRepository managerRepository;

	// add data
	@PostMapping("/add")
	public ResponseEntity<String> addManager(@RequestBody Manager manager) {
		System.out.println("hello");
		managerRepository.save(manager);
		return new ResponseEntity<String>("Add successfully", HttpStatus.ACCEPTED);
	}

	// get Manager
	@GetMapping("/get")
	public ResponseEntity<List<Manager>> getManager() {
		List<Manager> manager = managerRepository.findAll();
		return ResponseEntity.of(Optional.of(manager));
	}

	// delete Manager
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteManager(@PathVariable("id") int id) {
         managerRepository.deleteById(id);
         return new ResponseEntity<String>("delete successfully", HttpStatus.ACCEPTED);
	}
	

}
