package com.curso.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.api.entities.Curso;
import com.curso.api.repositories.CursoRepository;
import com.curso.api.services.CursoService;

@Service
public class CursoServiceimpl implements CursoService{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> getCursos() {
		return cursoRepository.findAll();
	}

}
