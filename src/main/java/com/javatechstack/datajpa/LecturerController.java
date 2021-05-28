package com.javatechstack.datajpa;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LecturerController {
	
 @Autowired
 LecturerRepository repository;                  
private Optional<Lecturer> lecturer;
 
 //@CrossOrigin(origins = "http://localhost:4200")
 
 @GetMapping("/lecturer/all")
 public List<Lecturer> getAllLecturers(){
	 return repository.findAll();
 }
 
 @PostMapping("/lecturer/add")
 public Lecturer addLecturer(@RequestBody Lecturer lec ) {
	 return repository.save(lec);
 }
 
 @GetMapping("/lecturer/{id}")
 public Optional<Lecturer> getLecturer(@PathVariable Integer id){
	 return repository.findById(id);
 }
 
 @PutMapping("/lecturer/update")
 public Lecturer updateLecturer( @RequestBody Lecturer lec) {
	// Optional<Subject> subject = repository.findById(id);
	// if(subject.isPresent())
		 return repository.save(lec);
	// else
		//  return null;
	 
 }
 
 @DeleteMapping("/lecturer/delete/{id}")
 public void deleteLecturer(@PathVariable Integer id) {
	 repository.deleteById(id);
 }
}
