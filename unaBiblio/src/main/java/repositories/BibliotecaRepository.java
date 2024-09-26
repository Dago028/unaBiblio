package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Biblioteca;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca,Integer> {
	
}
