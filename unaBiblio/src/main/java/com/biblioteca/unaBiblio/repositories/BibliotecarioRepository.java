package com.biblioteca.unaBiblio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.unaBiblio.models.Bibliotecario;



@Repository
public interface Bibliotecario extends JpaRepository<Bibliotecario,Integer> {
	
}

