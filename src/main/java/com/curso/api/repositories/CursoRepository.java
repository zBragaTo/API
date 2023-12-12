package com.curso.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.api.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
}
