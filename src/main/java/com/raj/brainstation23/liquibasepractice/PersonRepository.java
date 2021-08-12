package com.raj.brainstation23.liquibasepractice;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {

   // @Query("SELECT name FROM Person p where p.name like %:personName%")
   // String findByName(String personName);
    String findByNameIs(String personName);


//    @Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
//    String findByName(String studentName);
//
}
