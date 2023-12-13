package com.curso.api.cursos;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.curso.api.entities.Curso;

@TestInstance(Lifecycle.PER_CLASS)
class CursoTeste {

	Curso c = new Curso();
	
	@BeforeAll
	void iniciando() {
		System.out.println("Classe de teste CursoTeste iniciada ");
	}
	
	@BeforeEach
	void antesDeCadaUm() {
		System.out.println("Testanto um dos métodos...");
//		c = new Curso();
	}
	
	@AfterEach
	void depoisDeCadaUm() {
		System.out.println("Nome do Curso: " + c.getNome());
		c = new Curso();
	}
	
	@AfterAll
	void terminando() {
		System.out.println("Chegamos ao final do teste ! ");
	}
	
	@Test
	void testaSetaNome() {
		c.setNome("Teste de nome do curso");
		assertNotNull(c.getNome());
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
