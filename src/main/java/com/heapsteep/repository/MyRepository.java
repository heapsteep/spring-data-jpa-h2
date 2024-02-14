package com.heapsteep.repository;

import org.springframework.data.repository.CrudRepository;

import com.heapsteep.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends CrudRepository<Person,String>{
}
