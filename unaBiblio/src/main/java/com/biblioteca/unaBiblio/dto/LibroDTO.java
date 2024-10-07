package com.biblioteca.unaBiblio.dto;

import com.biblioteca.unaBiblio.models.Libro;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {
    private int idLibro;
    private String nombreLibro;
    private String autor;
    private String editorial;
    private String anio_publicacion;

    public LibroDTO(Libro libro) {
        this.idLibro =  libro.getIdLibro();
        this.nombreLibro = libro.getNombreLibro();
        this.autor = libro.getAutor();
        this.editorial = libro.getEditorial();
        this.anio_publicacion = libro.getAnioPublicacion();
    }
}
