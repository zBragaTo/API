package com.curso.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.api.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
