package com.mappings.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Manager {


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	 private int Id;
	 private String managerName;
	 @OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	 @JsonManagedReference
	 private List<Employee> employee;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Manager [Id=" + Id + ", managerName=" + managerName + ", employee=" + employee + "]";
	}
	
	 
}
