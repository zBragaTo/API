package com.curso.api.services;

import java.util.List;

import com.curso.api.entities.Curso;

public interface CursoService {
	
	public List<Curso> getCursos();
	
	public Curso save(Curso curso);
	
	public Curso findById(Integer id);
	
	public List<Curso> findByNome(String valor);
	
	public void update(Curso curso);
	
	public void deleteById(Integer id);


}
