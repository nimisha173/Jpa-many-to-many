package com.example.Jpamanytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="COURSE_TBL")
public class Course {
	@Id
	@GeneratedValue
private Long id;
private String title;
private String abbrevation;
private int module;
private double fee;

@ManyToMany(mappedBy="courses",fetch=FetchType.LAZY)
@JsonManagedReference
private Set<Student>students;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAbbrevation() {
	return abbrevation;
}

public void setAbbrevation(String abbrevation) {
	this.abbrevation = abbrevation;
}

public int getModule() {
	return module;
}

public void setModule(int module) {
	this.module = module;
}

public double getFee() {
	return fee;
}

public void setFee(double fee) {
	this.fee = fee;
}

public Set<Student> getStudents() {
	return students;
}

public void setStudents(Set<Student> students) {
	this.students = students;
}

public Course(Long id, String title, String abbrevation, int module, double fee, Set<Student> students) {

	this.id = id;
	this.title = title;
	this.abbrevation = abbrevation;
	this.module = module;
	this.fee = fee;
	this.students = students;
}
}