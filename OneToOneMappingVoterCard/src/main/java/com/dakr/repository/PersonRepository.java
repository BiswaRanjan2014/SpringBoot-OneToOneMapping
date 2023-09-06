package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.Person;

public interface PersonRepository  extends JpaRepository<Person,Long>{

}
