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
public class SubjectController {
	
 @Autowired
 SubjectRepository repository;
private Optional<Subject> subject;
 
 //@CrossOrigin(origins = "http://localhost:4200")
 
 @GetMapping("/subject/all")
 public List<Subject> getAllSubjects(){
	 return repository.findAll();
 }
 
 @PostMapping("/subject/add")
 public Subject addSubject(@RequestBody Subject sub ) {
	 return repository.save(sub);
 }
 
 @GetMapping("/subject/{id}")
 public Optional<Subject> getSubject(@PathVariable Integer id){
	 return repository.findById(id);
 }
 
 @PutMapping("/subject/update")
 public Subject updateSubject( @RequestBody Subject sub) {
	// Optional<Subject> subject = repository.findById(id);
	// if(subject.isPresent())
		 return repository.save(sub);
	// else
		//  return null;
	 
 }
 
 @DeleteMapping("/subject/delete/{id}")
 public void deleteSubject(@PathVariable Integer id) {
	 repository.deleteById(id);
 }
 
 
}
