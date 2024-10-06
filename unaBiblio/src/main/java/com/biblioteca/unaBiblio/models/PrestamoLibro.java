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

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "prestamo_libro")

public class PrestamoLibro {
	
	//Definicion de los campos de Biblioteca
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prestamo;
	
	@Column(name="fecha_prestamo", length = 200)
	private Date fechaPrestamo;
	
	@Column(name="fecha_devolucion")
	private Date fechaDevolucion;

    @Column(name="estado_prestamo")
    private boolean estadoPrestamo;

    @Column(name="observaciones")
    private boolean observaciones;
	
}
