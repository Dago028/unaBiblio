package com.biblioteca.unaBiblio.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libros")
public class Libro {
	
	//Definicion de los campos de Biblioteca
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro", nullable = false)
	private int idLibro;
	
	@Column(name="nombre_libro", length = 200)
	private String nombreLibro;
	
    @Column(name="autor", length = 200)
	private String autor;

    @Column(name="editorial", length = 200)
	private String editorial;

    @Column(name="anio_publicacion", length = 200)
	private String anioPublicacion;
	
}
