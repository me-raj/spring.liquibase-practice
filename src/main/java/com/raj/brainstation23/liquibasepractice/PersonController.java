package com.raj.brainstation23.liquibasepractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {


    @Autowired
    PersonRepository personRepository;

    @PostMapping("/save")
    public String createPerson(@RequestParam String name,
                               @RequestParam String food,
                               @RequestParam String address) {

        personRepository.save(new PersonEntity(name, food, address));
        return personRepository.findByName(name) + " Saved!";

    }


    @GetMapping("/get")
    public List<PersonEntity> getAlll() {
        return (List<PersonEntity>) personRepository.findAll();
    }

}
