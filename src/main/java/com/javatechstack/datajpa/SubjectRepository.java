package com.javatechstack.datajpa;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
 public interface SubjectRepository extends MongoRepository<Subject, Integer> {

}
