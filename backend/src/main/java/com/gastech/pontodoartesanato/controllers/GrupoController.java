package com.gastech.pontodoartesanato.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gastech.pontodoartesanato.dto.GrupoDTO;
import com.gastech.pontodoartesanato.services.GrupoService;

@RestController
@RequestMapping(value = "/grupos")
public class GrupoController {
	
	@Autowired
	private GrupoService service;
	
	@GetMapping
	public ResponseEntity<List<GrupoDTO>> findAll() {
		List<GrupoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@PostMapping
	public ResponseEntity<GrupoDTO> insert(@RequestBody GrupoDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
