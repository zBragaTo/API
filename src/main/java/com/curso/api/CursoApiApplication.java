package com.curso.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.api.entities.Curso;
import com.curso.api.repositories.CursoRepository;

@SpringBootApplication
public class CursoApiApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoApiApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Curso curso1 = new Curso("Graduação em TI", "EXATAS");
		Curso curso2 = new Curso("Graduação em ECONOMIA", "EXATAS");
		Curso curso3 = new Curso("Graduação em ADM", "HUMANAS");
		Curso curso4 = new Curso("Graduação em EDF", "HUMANAS");

		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);

	}
}
