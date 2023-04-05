package com.example.Jpamanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jpamanytomany.entity.Course;
import com.example.Jpamanytomany.entity.Student;
import com.example.Jpamanytomany.repo.Courserepository;
import com.example.Jpamanytomany.repo.Studentrepository;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	@Autowired
	private Studentrepository studentrepo;
	@Autowired
	private Courserepository courserepo;
	
 @PostMapping("/add")
 public Student saveStudentwithCourse(@RequestBody Student student) {
	 return studentrepo.save(student);
 }
 @GetMapping("/students") 
 public List<Student>findAllStudents(){
	 return studentrepo.findAll();
 }
 //@GetMapping("/{studentid}")
 //public Student findStudent(@PathVariable Long studentid) {
	// return studentrepo.finddById(studentid).orElse(null);
 //}
//@GetMapping("/find/{name}")
//public List<Student>findStudentByName(@PathVariable String name){
	//return studentrepo.findByNameContaining(name);
	
//}
//@GetMapping("/search/{price}")
//public List<Course>findCourselesstheanprice(@PathVariable double price){
	//return courserepo.findlessthanprice(price) ;
	
//}
}
