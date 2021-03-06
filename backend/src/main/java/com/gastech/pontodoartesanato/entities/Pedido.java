package com.gastech.pontodoartesanato.entities;

import java.io.Serializable;
import java.time.Instant;
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
@Table(name = "tb_pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double pedidototal;
	private Instant pedidomomento;
	private OrderStatus pedidostatus;

	@ManyToMany
	@JoinTable(name = "tb_pedido_produto",
			joinColumns = @JoinColumn(name = "pedido_id"),
			inverseJoinColumns = @JoinColumn(name = "produto_id")
			)
	private Set<Produto> produtos = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "tb_pedido_cliente",
			joinColumns = @JoinColumn(name = "pedido_id"),
			inverseJoinColumns = @JoinColumn(name = "cliente_id"))
	private Set<Cliente> clientes = new HashSet<>();

	
			
	public Pedido() {
	}

	public Pedido(Long id, Double pedidototal, Instant pedidomomento,
			OrderStatus pedidostatus) {
		super();
		this.id = id;
		this.pedidototal = pedidototal;
		this.pedidomomento = pedidomomento;
		this.pedidostatus = pedidostatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPedidototal() {
		return pedidototal;
	}

	public void setPedidototal(Double pedidototal) {
		this.pedidototal = pedidototal;
	}

	public Instant getPedidomomento() {
		return pedidomomento;
	}

	public void setPedidomomento(Instant pedidomomento) {
		this.pedidomomento = pedidomomento;
	}

	public OrderStatus getPedidostatus() {
		return pedidostatus;
	}

	public void setPedidostatus(OrderStatus pedidostatus) {
		this.pedidostatus = pedidostatus;
	}
	
	
	

	public Set<Produto> getProdutos() {
		return produtos;
	}
	
	public Set<Cliente> getClientes() {
		return clientes;
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
}
