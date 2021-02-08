package com.gastech.pontodoartesanato.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.PedidoDTO;
import com.gastech.pontodoartesanato.dto.ProdutoDTO;
import com.gastech.pontodoartesanato.entities.OrderStatus;
import com.gastech.pontodoartesanato.entities.Pedido;
import com.gastech.pontodoartesanato.entities.Produto;
import com.gastech.pontodoartesanato.repositories.PedidoRepository;
import com.gastech.pontodoartesanato.repositories.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
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
		
		
//		pedido = repository.save(pedido);
		
//		for (ClienteDTO c : dto.getClientes()) {
//			Cliente cliente = clienteRepository.getOne(c.getId());
//			pedido.getClientes().add(cliente);
//		}
		pedido = repository.save(pedido);
		
		return new PedidoDTO(pedido);
	}
		
}
