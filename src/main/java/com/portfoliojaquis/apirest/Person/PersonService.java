package com.portfoliojaquis.apirest.Person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepo;
    public void createEducacion(Person person) 
    {
        personRepo.save(person);
}
}
