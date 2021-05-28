package com.javatechstack.datajpa;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
 @Autowired
 StudentRepository repository;                  
private Optional<Student> lecturer;
 

 
 @GetMapping("/student/all")
 public List<Student> getAllStudents(){
	 return repository.findAll();
 }
 
 @PostMapping("/student/add")
 public Student addStudent(@RequestBody Student std ) {
	 return repository.save(std);
 }
 
 @GetMapping("/student/{id}")
 public Optional<Student> getstudent(@PathVariable Integer id){
	 return repository.findById(id);
 }
 
 @PutMapping("/student/update")
 public Student updateStudent( @RequestBody Student std) {
	// Optional<Subject> subject = repository.findById(id);
	// if(subject.isPresent())
		 return repository.save(std);
	// else
		//  return null;
	 
 }
 
 @DeleteMapping("/student/delete/{id}")
 public void deletestudent(@PathVariable Integer id) {
	 repository.deleteById(id);
 }
}
