package controllers;

import dto.BibliotecaDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.BibliotecaService;

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
