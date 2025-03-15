/*package com.biblioteca.unaBiblio.dto;

import com.biblioteca.unaBiblio.models.PrestamoLibro;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrestamoLibroDTO {
    private int idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean estado;
    private String observaciones;

    public PrestamoLibroDTO(PrestamoLibro prestamoLibro) {
        this.idPrestamo =  prestamoLibro.getPrestamo();
        this.fechaPrestamo = prestamoLibro.getFechaPrestamo();
        this.fechaDevolucion = prestamoLibro.getFechaDevolucion();
        this.estado =  prestamoLibro.getEstado();
        this.observaciones =  prestamoLibro.getObservaciones();
    }
}*/
