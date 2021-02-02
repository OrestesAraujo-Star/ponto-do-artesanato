package com.gastech.pontodoartesanato.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.PedidoDTO;
import com.gastech.pontodoartesanato.entities.Pedido;
import com.gastech.pontodoartesanato.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	@Transactional(readOnly = true)
	public List<PedidoDTO> findAll() {
		//List<Pedido> list = repository.findAll();
		List<Pedido> list = repository.findPedidosWithProdutos();
		return list.stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
		
	}

}
