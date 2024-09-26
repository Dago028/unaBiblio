package com.biblioteca.unaBiblio.services;

import com.biblioteca.unaBiblio.dto.BibliotecaDTO;
import com.biblioteca.unaBiblio.models.Biblioteca;
import com.biblioteca.unaBiblio.repositories.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public List<BibliotecaDTO> getAllBibliotecas() {
        List<Biblioteca> bibliotecas = bibliotecaRepository.findAll();
        return bibliotecas.stream()
            .map(b -> new BibliotecaDTO(b.getId_biblioteca(), b.getFacultad(), b.getEstado()))
            .collect(Collectors.toList());
    }
}
