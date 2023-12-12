package com.curso.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoResource {
	
	@GetMapping
	public String getCursos() {
		return "Endpoint para os cursos";
	}

}
