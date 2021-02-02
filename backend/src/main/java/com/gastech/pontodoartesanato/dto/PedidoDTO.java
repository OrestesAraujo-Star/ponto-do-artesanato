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
	private Double pedido_total;
	private Instant pedidomomento;
	private OrderStatus pedidostatus;
	
	private List<ProdutoDTO> produtos = new ArrayList<>();
	
	public PedidoDTO() {		
	}

	public PedidoDTO(Long id, Double pedido_total, Instant pedidomomento, OrderStatus pedidostatus) {
		this.id = id;
		this.pedido_total = pedido_total;
		this.pedidomomento = pedidomomento;
		this.pedidostatus = pedidostatus;
	}
	
	public PedidoDTO(Pedido entity) {
		id = entity.getId();
		pedido_total = entity.getPedido_total();
		pedidomomento = entity.getPedidomomento();
		pedidostatus = entity.getPedidostatus();
		produtos = entity.getProdutos().stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPedido_total() {
		return pedido_total;
	}

	public void setPedido_total(Double pedido_total) {
		this.pedido_total = pedido_total;
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



	
}
