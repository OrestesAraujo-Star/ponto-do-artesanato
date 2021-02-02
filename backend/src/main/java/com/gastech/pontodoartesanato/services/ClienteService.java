package com.gastech.pontodoartesanato.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gastech.pontodoartesanato.dto.ClienteDTO;
import com.gastech.pontodoartesanato.entities.Cliente;
import com.gastech.pontodoartesanato.repositories.ClienteRepository;
import com.gastech.pontodoartesanato.repositories.PedidoRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Transactional(readOnly = true)
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAllByOrderByNomeAsc();
		return list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
		
	}

	public PedidoRepository getPedidoRepository() {
		return pedidoRepository;
	}

	public void setPedidoRepository(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

}
