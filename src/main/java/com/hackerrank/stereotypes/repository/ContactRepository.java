package com.hackerrank.stereotypes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.hackerrank.stereotypes.model.Person;


@Repository
public interface ContactRepository extends JpaRepository<Person,Integer> {
}
