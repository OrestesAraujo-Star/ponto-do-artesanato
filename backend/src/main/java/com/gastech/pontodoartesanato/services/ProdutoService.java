package com.gastech.pontodoartesanato.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.ProdutoDTO;
import com.gastech.pontodoartesanato.entities.Produto;
import com.gastech.pontodoartesanato.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll() {
		List<Produto> list = repository.findAllByOrderByProdutonomeAsc();
		return list.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
		
	}

}
