package com.gastech.pontodoartesanato.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gastech.pontodoartesanato.entities.Grupo;

public class GrupoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String gruponome;
	
	private List<ProdutoDTO> produtos = new ArrayList<>();
	
	public GrupoDTO() {
	}

	public GrupoDTO(Long id, String gruponome) {
		this.id = id;
		this.gruponome = gruponome;
	}

	public GrupoDTO(Grupo entity) {
		id = entity.getId();
		gruponome = entity.getGruponome();
		produtos = entity.getProdutos().stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGruponome() {
		return gruponome;
	}

	public void setGruponome(String gruponome) {
		this.gruponome = gruponome;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}
