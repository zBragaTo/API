package com.curso.api.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.entities.Curso;
import com.curso.api.entities.dto.CursoDTO;
import com.curso.api.entities.mapper.CursoMapper;
import com.curso.api.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@Autowired
	private CursoService cursoService;

	@Autowired
	private CursoMapper mapper;

	@GetMapping
	public ResponseEntity<List<Curso>> getCursos() {

		List<Curso> lista = cursoService.getCursos();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Curso> findCurso(@PathVariable Integer id) {

		Curso curso = cursoService.findById(id);

		return ResponseEntity.ok().body(curso);
	}

	@GetMapping("/nome")
	public ResponseEntity<List<Curso>> findCursoByNome(@RequestParam String valor) {

		System.out.println("Nome a pesquisar: " + valor);

		List<Curso> cursos = cursoService.findByNome(valor);

		return ResponseEntity.ok().body(cursos);
	}

	@PostMapping
	public ResponseEntity<Curso> saveCurso(@RequestBody CursoDTO dto) throws URISyntaxException {

		Curso novoCurso = cursoService.save(mapper.mapCursoDTOToCurso(dto));

		return ResponseEntity.created(new URI("/cursos/salva/" + novoCurso.getId())).body(novoCurso);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCurso(@RequestBody CursoDTO dto, @PathVariable Integer id)
			throws URISyntaxException {

		Curso novo = mapper.mapCursoDTOToCurso(dto);
		novo.setId(id);
		cursoService.update(novo);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCurso(@PathVariable Integer id) throws URISyntaxException {
		cursoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
