package com.portfoliojaquis.apirest.Educacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/educacion")
@RequiredArgsConstructor

public class EducacionController {
    @Autowired
    private final EducacionRepository educacionRepository;

    @GetMapping("/educacion")
    public List<Educacion> getAllEducations() {
        return educacionRepository.findAll();
    }

    @PostMapping("/educacion")
public Educacion createEducation(@RequestBody Educacion educacion) {
    return educacionRepository.save(educacion);
}
    
}
