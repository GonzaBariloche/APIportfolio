package com.portfoliojaquis.apirest.Educacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://portfoliojaquis.web.app")
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

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEducacion(@PathVariable(value = "id") Integer educacionId, @RequestBody Educacion educacionDetails) {
        Educacion educacion = educacionService.findById(educacionId);
    
        if (educacion == null) {
            return ResponseEntity.notFound().build();
        }
    
        educacion.setSchool(educacionDetails.getSchool());
        educacion.setTitle(educacionDetails.getTitle());
        educacion.setImg(educacionDetails.getImg());
        educacion.setCareer(educacionDetails.getCareer());
        educacion.setStart(educacionDetails.getStart());
        educacion.setEnd(educacionDetails.getEnd());
    
        educacionService.updateEducacion(educacion);
    
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable(value = "id") Integer educacionId) {
        Educacion educacion = educacionService.findById(educacionId);
    
        if (educacion == null) {
            return ResponseEntity.notFound().build();
        }
    
        educacionService.deleteEducacion(educacionId);
    
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Educacion> getEducacionById(@PathVariable Integer id) {
        Educacion educacion = educacionService.findById(id);
        if (educacion != null) {
            return ResponseEntity.ok(educacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

}
