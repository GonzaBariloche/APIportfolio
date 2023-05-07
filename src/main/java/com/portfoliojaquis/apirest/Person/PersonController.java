package com.portfoliojaquis.apirest.Person;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    @Autowired
    private final PersonService personService;

    @PostMapping
    public void createEducacion(@RequestBody Person person) 
    {
        personService.createEducacion(person);
    }

    
}
