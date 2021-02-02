package com.gastech.pontodoartesanato.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.GrupoDTO;
import com.gastech.pontodoartesanato.entities.Grupo;
import com.gastech.pontodoartesanato.repositories.GrupoRepository;

import org.springframework.stereotype.Service;

@Service
public class GrupoService {
	
	@Autowired
	private GrupoRepository repository;
	
	@Transactional(readOnly = true)
	public List<GrupoDTO> findAll() {
		List<Grupo> list = repository.findAllByOrderByGruponomeAsc();
		return list.stream().map(x -> new GrupoDTO(x)).collect(Collectors.toList());
		
	}

}
