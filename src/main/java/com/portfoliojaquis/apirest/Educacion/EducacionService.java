package com.portfoliojaquis.apirest.Educacion;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducacionService {
    private final EducacionRepository educacionRepo;

    public List<Educacion> findAll() {
        return educacionRepo.findAll();
    }

    public void createEducacion(Educacion educacion) 
    {
        educacionRepo.save(educacion);
    }
}
