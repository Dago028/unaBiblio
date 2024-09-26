package com.biblioteca.unaBiblio.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.unaBiblio.dto.BibliotecaDTO;
import com.biblioteca.unaBiblio.services.BibliotecaService;

@RestController
@RequestMapping("/api")
public class BibliotecaController {
    
    @Autowired
    private BibliotecaService bibliotecaService;
    
    @GetMapping("/bibliotecas")
    public List<BibliotecaDTO> getAllBibliotecas() {
        return bibliotecaService.getAllBibliotecas();
    }
}


