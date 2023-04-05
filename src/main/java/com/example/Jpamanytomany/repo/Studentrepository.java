package com.example.Jpamanytomany.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Jpamanytomany.entity.Student;

public interface Studentrepository extends JpaRepository<Student,Long>{

	//Student finddById(Long studentid);

//	List<Student> findByNameContaining(String name);
	//List<Student>findAll();
	//Student save(Student student);
	//Optional<Student>findById(Long studentid);

	

	
}