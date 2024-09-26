package com.biblioteca.unaBiblio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BibliotecaDTO {
    private int id_biblioteca;
    private String facultad;
    private Boolean estado;
}


