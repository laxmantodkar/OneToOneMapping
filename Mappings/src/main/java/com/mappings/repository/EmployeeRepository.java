package com.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
