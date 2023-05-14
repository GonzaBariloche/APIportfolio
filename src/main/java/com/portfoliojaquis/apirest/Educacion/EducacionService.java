package com.portfoliojaquis.apirest.Educacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import com.portfoliojaquis.apirest.Educacion.EducacionRepository;

@Service
@RequiredArgsConstructor
public class EducacionService {
    @Autowired
    private final EducacionRepository educacionRepo;

    public List<Educacion> findAll() {
        return educacionRepo.findAll();
    }

    public void createEducacion(Educacion educacion) 
    {
        educacionRepo.save(educacion);
    }

    public void updateEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }
    
    public void deleteEducacion(Integer educacionId) {
        educacionRepo.deleteById(educacionId);
    }

    public Educacion findById(Integer id) {
        return educacionRepo.findById(id).orElse(null);
    }
}
