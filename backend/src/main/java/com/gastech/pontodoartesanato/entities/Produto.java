package com.gastech.pontodoartesanato.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String produtonome;
	private Double produto_preco;
	private String produto_descricao;
	private String produto_imagemURI_1;
	private String produto_imagemURI_2;
	private String produto_imagemURI_3;
	private String produto_imagemURI_4;
	private String produto_imagemURI_5;
	
	@OneToMany
	@JoinTable(name = "tb_produto_grupo",
			joinColumns = @JoinColumn(name = "produto_id"),
			inverseJoinColumns = @JoinColumn(name = "grupo_id"))
	private Set<Grupo> grupos = new HashSet<>();
	
	public Produto() {
	}

	public Produto(Long id, String produtonome, Double produto_preco, String produto_descricao,
			String produto_imagemURI_1, String produto_imagemURI_2, String produto_imagemURI_3,
			String produto_imagemURI_4, String produto_imagemURI_5) {
		super();
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
	
	public Set<Grupo> getGrupos() {
		return grupos;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
