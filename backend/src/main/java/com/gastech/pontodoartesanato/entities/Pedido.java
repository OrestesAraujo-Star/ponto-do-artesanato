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
	private Long pedido_id;
	private Long cliente_id;
	private Double pedido_total;
	private Instant pedido_momento;
	private OrderStatus pedido_status;

	@ManyToMany
	@JoinTable(name = "tb_pedido_pedido_itens",
			joinColumns = @JoinColumn(name = "pedido_id"),
			inverseJoinColumns = @JoinColumn(name = "pedido_itens_id"))
	private Set<Cliente> clientes = new HashSet<>();
	
	public Pedido() {
	}

	public Pedido(Long pedido_id, Long cliente_id, Double pedido_total, Instant pedido_momento,
			OrderStatus pedido_status) {
		super();
		this.pedido_id = pedido_id;
		this.cliente_id = cliente_id;
		this.pedido_total = pedido_total;
		this.pedido_momento = pedido_momento;
		this.pedido_status = pedido_status;
	}

	public Long getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Long pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Double getPedido_total() {
		return pedido_total;
	}

	public void setPedido_total(Double pedido_total) {
		this.pedido_total = pedido_total;
	}

	public Instant getPedido_momento() {
		return pedido_momento;
	}

	public void setPedido_momento(Instant pedido_momento) {
		this.pedido_momento = pedido_momento;
	}

	public OrderStatus getPedido_status() {
		return pedido_status;
	}

	public void setPedido_status(OrderStatus pedido_status) {
		this.pedido_status = pedido_status;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedido_id == null) ? 0 : pedido_id.hashCode());
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
		if (pedido_id == null) {
			if (other.pedido_id != null)
				return false;
		} else if (!pedido_id.equals(other.pedido_id))
			return false;
		return true;
	}
}
