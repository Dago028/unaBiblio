package com.biblioteca.unaBiblio.dto;

import com.biblioteca.unaBiblio.models.Alumno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO {
    private int idAlumno;
    private int cedula;
    private String nombreApellido;

    public AlumnoDTO(Alumno alumno) {
        this.idAlumno =  alumno.getIdAlumno();
        this.cedula = alumno.getCedula();
        this.nombreApellido = alumno.getNombreApellido();
    }
}
