package com.raj.brainstation23.liquibasepractice;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {

    @Query("SELECT name FROM PersonEntity p where p.name like %:personName%")
    String findByName(String personName);


}
