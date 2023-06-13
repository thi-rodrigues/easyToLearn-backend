package com.trsystems.easytolearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trsystems.easytolearn.domain.Dicionario;
import com.trsystems.easytolearn.service.DicionarioService;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/dicionario")
public class DicionarioController {
	
	@Autowired
	private DicionarioService dicionarioService;

	@PostMapping("/cadastrar")
	public ResponseEntity<Dicionario> cadastrar(@RequestBody Dicionario dicionario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(dicionarioService.cadastrar(dicionario));
	}
	
	@GetMapping("/todos")
	public ResponseEntity<Page<Dicionario>> buscarTodos(Pageable pageable) {
		return ResponseEntity.ok(dicionarioService.buscarTodos(pageable));
	}
	
}
