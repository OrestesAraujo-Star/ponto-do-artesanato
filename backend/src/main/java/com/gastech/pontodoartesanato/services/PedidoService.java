package com.gastech.pontodoartesanato.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.ClienteDTO;
import com.gastech.pontodoartesanato.dto.PedidoDTO;
import com.gastech.pontodoartesanato.dto.ProdutoDTO;
import com.gastech.pontodoartesanato.entities.Cliente;
import com.gastech.pontodoartesanato.entities.OrderStatus;
import com.gastech.pontodoartesanato.entities.Pedido;
import com.gastech.pontodoartesanato.entities.Produto;
import com.gastech.pontodoartesanato.repositories.ClienteRepository;
import com.gastech.pontodoartesanato.repositories.PedidoRepository;
import com.gastech.pontodoartesanato.repositories.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll() {
		//List<Pedido> list = repository.findAll();
		List<Pedido> list = repository.findPedidosWithProdutos();
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}	
	@Transactional
	public PedidoDTO insert(PedidoDTO dto) {
		Pedido pedido = new Pedido(null, dto.getPedidototal(), Instant.now(), OrderStatus.PENDING);
		for (ProdutoDTO p : dto.getProdutos()) {
			Produto produto = produtoRepository.getOne(p.getId());
			pedido.getProdutos().add(produto);
		}

		for (ClienteDTO p : dto.getClientes()) {
			Cliente cliente = clienteRepository.getOne(p.getId());
			pedido.getClientes().add(cliente);
		}
		
		
		pedido = repository.save(pedido);
		
		return new PedidoDTO(pedido);
	}
	
	@Transactional
	public PedidoDTO setDelivered(Long id) {
		Pedido pedido = repository.getOne(id);
		pedido.setPedidostatus(OrderStatus.DELIVERED);
		pedido = repository.save(pedido);
		return new PedidoDTO(pedido);
		
	}
		
}
