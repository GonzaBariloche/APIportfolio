package com.portfoliojaquis.apirest.Educacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor

public class EducacionController {

    @Autowired
    private final EducacionService educacionService;

    @GetMapping("")
    public List<Educacion> getAllEducations() {
        return educacionService.findAll();
    }

    @PostMapping
    public void createEducacion(@RequestBody Educacion educacion) 
    {
    educacionService.createEducacion(educacion);
    }
}
