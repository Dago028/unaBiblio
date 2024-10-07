UsuarioController package com.biblioteca.unaBiblio.controllers;

import com.biblioteca.unaBiblio.dto.UsuarioDTO;
import com.biblioteca.unaBiblio.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;



}