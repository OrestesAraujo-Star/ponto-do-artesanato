package com.gastech.pontodoartesanato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastech.pontodoartesanato.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
