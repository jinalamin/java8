package com.yash.demo;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	String name;
	int id;
	int salary;
	LocalDate Dob;
	LocalDate Doj;
	String role;
	int experience;
	Long mobileNumber;
	char gender;
	int age ;
	
	
	
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public Employee(String name, int id, int salary, LocalDate dob, LocalDate doj, String role, int experience, Long mobileNumber,
			char gender, int age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		Dob = dob;
		Doj = doj;
		this.role = role;
		this.experience = experience;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDob() {
		return Dob;
	}


	public void setDob(LocalDate dob) {
		Dob = dob;
	}


	public LocalDate getDoj() {
		return Doj;
	}


	public void setDoj(LocalDate doj) {
		Doj = doj;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "\n Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", Dob=" + Dob + ", Doj=" + Doj
				+ ", role=" + role + ", experience=" + experience + ", mobileNumber=" + mobileNumber + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
	
	
}
