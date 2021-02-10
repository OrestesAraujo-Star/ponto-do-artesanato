package com.gastech.pontodoartesanato.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gastech.pontodoartesanato.entities.OrderStatus;
import com.gastech.pontodoartesanato.entities.Pedido;

public class PedidoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double pedidototal;
	private Instant pedidomomento;
	private OrderStatus pedidostatus;
	
	private List<ProdutoDTO> produtos = new ArrayList<>();
	
	private List<ClienteDTO> clientes = new ArrayList<>();
	
	public PedidoDTO() {		
	}

	public PedidoDTO(Long id, Double pedidototal, Instant pedidomomento, OrderStatus pedidostatus) {
		this.id = id;
		this.pedidototal = pedidototal;
		this.pedidomomento = pedidomomento;
		this.pedidostatus = pedidostatus;
	}
	
	public PedidoDTO(Pedido entity) {
		id = entity.getId();
		pedidototal = entity.getPedidototal();
		pedidomomento = entity.getPedidomomento();
		pedidostatus = entity.getPedidostatus();
		produtos = entity.getProdutos().stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
		clientes = entity.getClientes().stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
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

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public List<ClienteDTO> getClientes() {
		return clientes;
	}
	
}
