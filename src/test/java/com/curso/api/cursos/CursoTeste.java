package com.curso.api.cursos;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.curso.api.entities.Curso;

class CursoTeste {

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
