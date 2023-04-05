package com.example.Jpamanytomany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Jpamanytomany.entity.Course;

public interface Courserepository extends  JpaRepository<Course,Long>{
	

	//public List<Course> findlessthanprice(double price);
}