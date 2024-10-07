package com.biblioteca.unaBiblio.controllers;

import com.biblioteca.unaBiblio.dto.BibliotecarioDTO;
import com.biblioteca.unaBiblio.services.BibliotecarioService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/bibliotecario")
public class BibliotecarioController {

    @Autowired
    private BibliotecarioService bibliotecarioService;



}
