package com.curso.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.api.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
	List<Curso> findByNomeContaining(String nome);
	
	List<Curso> findByArea(String area);
}
