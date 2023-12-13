package com.curso.api.entities.mapper;

import org.springframework.stereotype.Service;

import com.curso.api.entities.Curso;
import com.curso.api.entities.dto.CursoDTO;

@Service
public class CursoMapper {
	
	public Curso mapCursoDTOToCurso (CursoDTO dto) {
		Curso curso = new Curso(dto.getNome(), dto.getArea());
		return curso;
	}

}
