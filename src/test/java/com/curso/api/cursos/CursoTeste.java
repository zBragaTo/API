package com.curso.api.cursos;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.curso.api.entities.Curso;

@TestInstance(Lifecycle.PER_CLASS)
class CursoTeste {

	Curso c;
	
	@BeforeAll
	void iniciando() {
		System.out.println("Classe de teste CursoTeste iniciada ");
	}
	
	@BeforeEach
	void antesDeCadaUm() {
		System.out.println("Testanto um dos métodos...");
		c = new Curso();
	}
	
	@Test
	void test() {
//		fail("Not yet implemented");
	}

	@Test
	void testaCursosNaoVazio() {

		Curso c = new Curso();
		assertNotNull(c);
	}

	@Test
	void valorDoCursoNaoNulo() {
		
		Curso c = new Curso();
		Assertions.assertNotNull(c.getValorDoCurso());
	}

	@Test
	void testaNovoCursoValorZero() {

		Curso curso = new Curso();
		Assertions.assertEquals(new BigDecimal(0), curso.getValorDoCurso());
	}

	@Test
	void testaNovoCursoSemAlunos() {

		Curso curso = new Curso();
		Assertions.assertTrue(curso.getAlunos().isEmpty());
	}

}
