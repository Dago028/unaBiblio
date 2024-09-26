package services;



import dto.BibliotecaDTO;
import models.Biblioteca;
import repositories.BibliotecaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class BibliotecaService {
	@Autowired
	private BibliotecaRepository bibliotecaRepository;
	
	public List<BibliotecaDTO> getAllBibliotecas() {
		//Convertimos las entidades a DTO
		List<Biblioteca> bibliotecas = bibliotecaRepository.findAll();
		return bibliotecas.stream()
								.map(BibliotecaDTO::new)
								.collect(Collectors.toList());
	}
}
