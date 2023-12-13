package com.curso.api.resources;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.entities.Curso;
import com.curso.api.entities.dto.CursoDTO;
import com.curso.api.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@Autowired
	private CursoService cursoService;

	@GetMapping
	public ResponseEntity<List<Curso>> getCursos() {

		List<Curso> lista = cursoService.getCursos();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("/salva")
	public ResponseEntity<Curso> saveCurso(@RequestBody CursoDTO curso) throws URISyntaxException {

//		Curso novoCurso = cursoService.save(curso);
//		
//		return ResponseEntity.created(new URI("/cursos/salva/" + novoCurso.getId()))
//				.body(novoCurso);
		return null;
	}

}
