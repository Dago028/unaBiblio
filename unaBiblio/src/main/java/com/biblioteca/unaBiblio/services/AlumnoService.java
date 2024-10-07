package com.biblioteca.unaBiblio.services;

import com.biblioteca.unaBiblio.dto.AlumnoDTO;
import com.biblioteca.unaBiblio.models.Alumno;
import com.biblioteca.unaBiblio.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository AlumnoRepository;

}