package com.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entities.Student;
import com.mapping.entities.Training;
import com.mapping.entities.TrainingDto;
import com.mapping.repository.TrainingRepository;
import com.mapping.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	private TrainingService trainingService;
	
	@GetMapping("/get")
	public ResponseEntity<List<TrainingDto>> getTraining() {    
		List<TrainingDto> training = trainingService.getTraining();
		return ResponseEntity.of(Optional.of(training));
	}
	// add 
	@PostMapping("/add")
	public ResponseEntity<String> addTraining(@RequestBody Training training)
	{
		trainingService.addTraining(training);
		return new ResponseEntity<String>("add successfully",HttpStatus.ACCEPTED);
	}
	//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTraining(@PathVariable("id") int id)
	{
		trainingService.deleteTraining(id);
		return new ResponseEntity<String>("delete successfully",HttpStatus.ACCEPTED);
	}
	//update
	@PutMapping("/update")
	public ResponseEntity<String> updateTraining(@RequestBody Training training)
	{
		trainingService.updateTraining(training);
		return new ResponseEntity<String>("update successfully",HttpStatus.ACCEPTED);
	}

}
