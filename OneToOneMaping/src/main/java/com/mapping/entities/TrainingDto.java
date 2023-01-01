package com.mapping.entities;

public class TrainingDto {

	private int id;
	private String trainingName;
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "TrainingDto [id=" + id + ", trainingName=" + trainingName + ", student=" + student + "]";
	}
	
}
