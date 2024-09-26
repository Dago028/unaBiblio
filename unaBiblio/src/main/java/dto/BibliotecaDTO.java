package dto;

import lombok.Data;
import models.Biblioteca;


@Data
public class BibliotecaDTO {
	private int id_biblioteca;
	private String facultad;
	
	
	public BibliotecaDTO() {
		
	}
	
	public BibliotecaDTO(Biblioteca biblioteca) {
		this.id_biblioteca = biblioteca.getId_biblioteca();
		this.facultad = biblioteca.getFacultad();
	}
}
