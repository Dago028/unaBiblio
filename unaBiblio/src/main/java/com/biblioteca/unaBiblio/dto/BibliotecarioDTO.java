package com.biblioteca.unaBiblio.dto;

import com.biblioteca.unaBiblio.models.Bibliotecario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BibliotecarioDTO {
    private int idBibliotecario;
    private int cedula;
    private String nombreApellido;
    private String cargo;
    private String anio_publicacion;

    public BibliotecarioDTO(Bibliotecario bibliotecario) {
        this.idBibliotecario =  bibliotecario.getIdBibliotecario();
        this.cedula = bibliotecario.getNombreCedula();
        this.nombreApellido = bibliotecario.getNombreApellido();
        this.cargo = bibliotecario.getCargo();
    }
}
