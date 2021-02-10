package com.gastech.pontodoartesanato.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.GrupoDTO;
import com.gastech.pontodoartesanato.dto.ProdutoDTO;
import com.gastech.pontodoartesanato.entities.Grupo;
import com.gastech.pontodoartesanato.entities.Produto;
import com.gastech.pontodoartesanato.repositories.GrupoRepository;
import com.gastech.pontodoartesanato.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll() {
//		List<Produto> list = repository.findAll();
		List<Produto> list = repository.findAllByOrderByProdutonomeAsc();
		//List<Produto> list = repository.findPedidosWithProdutos();
		
		return list.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ProdutoDTO insert(ProdutoDTO dto) {
		Produto produto = new Produto(null, dto.getProdutonome(),
				dto.getProduto_preco(),
				dto.getProduto_descricao(),
				dto.getProduto_imagemURI_1(),
				dto.getProduto_imagemURI_2(),
				dto.getProduto_imagemURI_3(),
				dto.getProduto_imagemURI_4(),
				dto.getProduto_imagemURI_5()
				
				);

		for (GrupoDTO p : dto.getGrupos()) {
			Grupo grupo = grupoRepository.getOne(p.getId());
			produto.getGrupos().add(grupo);
		}		
				
		produto = repository.save(produto);		
		return new ProdutoDTO(produto);
	}

}
