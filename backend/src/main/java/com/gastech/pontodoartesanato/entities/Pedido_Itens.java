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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido_itens")
public class Pedido_Itens implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pedido_itens_id;
	private Long pedido_id;
	private Long produto_id;
	private Number produto_quantidade;
	
//	private Set<Pedido> pedidos = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name = "tb_pedido_itens_produto",
			joinColumns = @JoinColumn(name = "pedido_itens_id"),
			inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private Set<Produto> produtos = new HashSet<>();

	public Pedido_Itens() {
	}

	public Pedido_Itens(Long pedido_itens_id, Long pedido_id, Long produto_id, Number produto_quantidade) {
		super();
		this.pedido_itens_id = pedido_itens_id;
		this.pedido_id = pedido_id;
		this.produto_id = produto_id;
		this.produto_quantidade = produto_quantidade;
	}

	public Long getPedido_itens_id() {
		return pedido_itens_id;
	}

	public void setPedido_itens_id(Long pedido_itens_id) {
		this.pedido_itens_id = pedido_itens_id;
	}

	public Long getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Long pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Long getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Long produto_id) {
		this.produto_id = produto_id;
	}

	public Number getProduto_quantidade() {
		return produto_quantidade;
	}

	public void setProduto_quantidade(Number produto_quantidade) {
		this.produto_quantidade = produto_quantidade;
	}

//	public Set<Pedido> getPedidos() {
//		return pedidos;
//	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedido_itens_id == null) ? 0 : pedido_itens_id.hashCode());
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
		Pedido_Itens other = (Pedido_Itens) obj;
		if (pedido_itens_id == null) {
			if (other.pedido_itens_id != null)
				return false;
		} else if (!pedido_itens_id.equals(other.pedido_itens_id))
			return false;
		return true;
	}
}
