package com.ojas.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.person.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {
	List<Person> findByLastName(String lastName);
	List<Person> findByFirstNameOrLastName(String firstName,String lastName);

}
