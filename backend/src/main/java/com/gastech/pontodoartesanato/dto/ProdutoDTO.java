package com.gastech.pontodoartesanato.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.gastech.pontodoartesanato.entities.Produto;

public class ProdutoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String produtonome;
	private Double produto_preco;
	private String produto_descricao;
	private String produto_imagemURI_1;
	private String produto_imagemURI_2;
	private String produto_imagemURI_3;
	private String produto_imagemURI_4;
	private String produto_imagemURI_5;
	
	private List<GrupoDTO> grupos = new ArrayList<>();
	
	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String produtonome, Double produto_preco, String produto_descricao,
			String produto_imagemURI_1, String produto_imagemURI_2, String produto_imagemURI_3,
			String produto_imagemURI_4, String produto_imagemURI_5) {
		this.id = id;
		this.produtonome = produtonome;
		this.produto_preco = produto_preco;
		this.produto_descricao = produto_descricao;
		this.produto_imagemURI_1 = produto_imagemURI_1;
		this.produto_imagemURI_2 = produto_imagemURI_2;
		this.produto_imagemURI_3 = produto_imagemURI_3;
		this.produto_imagemURI_4 = produto_imagemURI_4;
		this.produto_imagemURI_5 = produto_imagemURI_5;
	}
	
	public ProdutoDTO(Produto entity) {
		id = entity.getId();
		produtonome = entity.getProdutonome();
		produto_preco = entity.getProduto_preco();
		produto_descricao = entity.getProduto_descricao();
		produto_imagemURI_1 = entity.getProduto_imagemURI_1();
		produto_imagemURI_2 = entity.getProduto_imagemURI_2();
		produto_imagemURI_3 = entity.getProduto_imagemURI_3();
		produto_imagemURI_4 = entity.getProduto_imagemURI_4();
		produto_imagemURI_5 = entity.getProduto_imagemURI_5();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutonome() {
		return produtonome;
	}

	public void setProdutonome(String produtonome) {
		this.produtonome = produtonome;
	}

	public Double getProduto_preco() {
		return produto_preco;
	}

	public void setProduto_preco(Double produto_preco) {
		this.produto_preco = produto_preco;
	}

	public String getProduto_descricao() {
		return produto_descricao;
	}

	public void setProduto_descricao(String produto_descricao) {
		this.produto_descricao = produto_descricao;
	}

	public String getProduto_imagemURI_1() {
		return produto_imagemURI_1;
	}

	public void setProduto_imagemURI_1(String produto_imagemURI_1) {
		this.produto_imagemURI_1 = produto_imagemURI_1;
	}

	public String getProduto_imagemURI_2() {
		return produto_imagemURI_2;
	}

	public void setProduto_imagemURI_2(String produto_imagemURI_2) {
		this.produto_imagemURI_2 = produto_imagemURI_2;
	}

	public String getProduto_imagemURI_3() {
		return produto_imagemURI_3;
	}

	public void setProduto_imagemURI_3(String produto_imagemURI_3) {
		this.produto_imagemURI_3 = produto_imagemURI_3;
	}

	public String getProduto_imagemURI_4() {
		return produto_imagemURI_4;
	}

	public void setProduto_imagemURI_4(String produto_imagemURI_4) {
		this.produto_imagemURI_4 = produto_imagemURI_4;
	}

	public String getProduto_imagemURI_5() {
		return produto_imagemURI_5;
	}

	public void setProduto_imagemURI_5(String produto_imagemURI_5) {
		this.produto_imagemURI_5 = produto_imagemURI_5;
	}

	public List<GrupoDTO> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<GrupoDTO> grupos) {
		this.grupos = grupos;
	}

}
