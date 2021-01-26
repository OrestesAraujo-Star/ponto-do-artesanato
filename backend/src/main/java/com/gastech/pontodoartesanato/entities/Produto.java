package com.gastech.pontodoartesanato.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long produto_id;
	private String produto_nome;
	private Double produto_preco;
	private String produto_descricao;
	private String produto_imagemURI_1;
	private String produto_imagemURI_2;
	private String produto_imagemURI_3;
	private String produto_imagemURI_4;
	private String produto_imagemURI_5;
	
	public Produto() {
	}

	public Produto(Long produto_id, String produto_nome, Double produto_preco, String produto_descricao,
			String produto_imagemURI_1, String produto_imagemURI_2, String produto_imagemURI_3,
			String produto_imagemURI_4, String produto_imagemURI_5) {
		super();
		this.produto_id = produto_id;
		this.produto_nome = produto_nome;
		this.produto_preco = produto_preco;
		this.produto_descricao = produto_descricao;
		this.produto_imagemURI_1 = produto_imagemURI_1;
		this.produto_imagemURI_2 = produto_imagemURI_2;
		this.produto_imagemURI_3 = produto_imagemURI_3;
		this.produto_imagemURI_4 = produto_imagemURI_4;
		this.produto_imagemURI_5 = produto_imagemURI_5;
	}

	public Long getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Long produto_id) {
		this.produto_id = produto_id;
	}

	public String getProduto_nome() {
		return produto_nome;
	}

	public void setProduto_nome(String produto_nome) {
		this.produto_nome = produto_nome;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto_id == null) ? 0 : produto_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (produto_id == null) {
			if (other.produto_id != null)
				return false;
		} else if (!produto_id.equals(other.produto_id))
			return false;
		return true;
	}
	
	
}
