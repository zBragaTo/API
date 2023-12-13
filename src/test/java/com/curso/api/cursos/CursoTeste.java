package com.curso.api.cursos;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
		assertNotNull(c.getValorDoCurso());
	}

}
