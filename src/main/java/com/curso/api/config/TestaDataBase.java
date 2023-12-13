package com.curso.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.curso.api.entities.Curso;
import com.curso.api.repositories.CursoRepository;

@Component
@Profile(value = "test")
public class TestaDataBase implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Curso curso1 = new Curso("Graduação em TI", "EXATAS");
		Curso curso2 = new Curso("Graduação em ECONOMIA", "EXATAS");
		Curso curso3 = new Curso("Graduação em ADM", "HUMANAS");
		Curso curso4 = new Curso("Graduação em EDF", "HUMANAS");
		Curso curso5 = new Curso("Graduação em Testes", "HUMANAS");

		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
		cursoRepository.save(curso5);

	}
}
