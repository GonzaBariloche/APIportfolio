package com.portfoliojaquis.apirest.Educacion;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EducacionService {
    private final EducacionRepository educacionRepo;
    public void createEducacion(Educacion educacion) 
    {
        educacionRepo.save(educacion);
}
}
