package com.biblioteca.unaBiblio.controllers;

import com.biblioteca.unaBiblio.dto.AlumnoDTO;
import com.biblioteca.unaBiblio.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;



}
