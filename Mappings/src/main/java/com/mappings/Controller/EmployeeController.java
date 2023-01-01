package com.mappings.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mappings.entities.Employee;
import com.mappings.entities.EmployeeDto;
import com.mappings.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	// Get Employee
	@GetMapping("/get")
	public ResponseEntity<List<EmployeeDto>> getEmp()
	{
		List<EmployeeDto> employeeDtos=new ArrayList<>();
		List<Employee> list = employeeRepository.findAll();
		for (Employee employee : list) {
			EmployeeDto employeeDto=new EmployeeDto();
			employeeDto.setId(employee.getId());
			employeeDto.setEmployeeName(employee.getEmployeeName());
			employeeDto.setManager(employee.getManager());
			employeeDtos.add(employeeDto);
		}
		
		return  ResponseEntity.of(Optional.of(employeeDtos));
	}

}
