package com.gastech.pontodoartesanato.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
