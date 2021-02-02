package com.gastech.pontodoartesanato.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastech.pontodoartesanato.entities.Grupo;
import com.gastech.pontodoartesanato.entities.Produto;

public interface GrupoRepository extends JpaRepository<Grupo, Long>{
	
	List<Grupo> findAllByOrderByGruponomeAsc();

}
