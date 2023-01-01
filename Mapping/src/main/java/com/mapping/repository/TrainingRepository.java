package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Student;
import com.mapping.entities.Training;



public interface TrainingRepository extends JpaRepository<Training, Integer>{

	public Training findById(int id);
}
