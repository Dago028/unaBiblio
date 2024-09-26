package com.biblioteca.unaBiblio.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.unaBiblio.dto.BibliotecaDTO;
import com.biblioteca.unaBiblio.services.BibliotecaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class BibliotecaController {
    
    @Autowired
    private BibliotecaService bibliotecaService;
    
    @GetMapping("/bibliotecas")
    public List<BibliotecaDTO> getAllBibliotecas() {
        return bibliotecaService.getAllBibliotecas();
    }
    
    @PostMapping("/crearbiblioteca") 
	public ResponseEntity<BibliotecaDTO> agregarBiblioteca(@RequestBody BibliotecaDTO bibliotecaDTO) {
		BibliotecaDTO nuevaBiblioteca = bibliotecaService.agregarBiblioteca(bibliotecaDTO);
		return new ResponseEntity<>(nuevaBiblioteca, HttpStatus.CREATED);
	}
    
    @PutMapping("/bibliotecas/{id}")
    public ResponseEntity<BibliotecaDTO> actualizarBiblioteca(@PathVariable int id, @Valid @RequestBody BibliotecaDTO bibliotecaDTO) {
        BibliotecaDTO bibliotecaActualizada = bibliotecaService.actualizarBiblioteca(id, bibliotecaDTO);
        return new ResponseEntity<>(bibliotecaActualizada, HttpStatus.OK);
    }
    
    @DeleteMapping("/bibliotecas/{id}")
    public ResponseEntity<Void> eliminarBiblioteca(@PathVariable int id) {
        bibliotecaService.eliminarBiblioteca(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}



