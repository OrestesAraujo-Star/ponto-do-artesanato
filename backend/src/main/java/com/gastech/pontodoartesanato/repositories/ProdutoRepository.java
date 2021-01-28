package com.gastech.pontodoartesanato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastech.pontodoartesanato.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByOrderByProdutonomeAsc();

}
