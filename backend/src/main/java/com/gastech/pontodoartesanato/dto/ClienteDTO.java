package com.gastech.pontodoartesanato.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gastech.pontodoartesanato.entities.Cliente;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String cliente_cpf;
	private String cliente_cnpj;
	private String cliente_email;
	private String cliente_endereco;
	private String cliente_municipio;
	private String cliente_estado;
	private String cliente_pais;
	private String cliente_cep;
	private String cliente_fone;
	private String cliente_usuario;
	private String cliente_senha;
	
//	private List<PedidoDTO> pedidos = new ArrayList<>();
	
	public ClienteDTO() {
	}

	public ClienteDTO(Long id, String nome, String cliente_cpf, String cliente_cnpj, String cliente_email,
			String cliente_endereco, String cliente_municipio, String cliente_estado, String cliente_pais,
			String cliente_cep, String cliente_fone, String cliente_usuario, String cliente_senha) {
		this.id = id;
		this.nome = nome;
		this.cliente_cpf = cliente_cpf;
		this.cliente_cnpj = cliente_cnpj;
		this.cliente_email = cliente_email;
		this.cliente_endereco = cliente_endereco;
		this.cliente_municipio = cliente_municipio;
		this.cliente_estado = cliente_estado;
		this.cliente_pais = cliente_pais;
		this.cliente_cep = cliente_cep;
		this.cliente_fone = cliente_fone;
		this.cliente_usuario = cliente_usuario;
		this.cliente_senha = cliente_senha;
	}
	
	public ClienteDTO(Cliente entity) {
		id = entity.getId();
		nome = entity.getNome();
		cliente_cpf = entity.getCliente_cpf();
		cliente_cnpj = entity.getCliente_cnpj();
		cliente_email = entity.getCliente_email();
		cliente_endereco = entity.getCliente_endereco();
		cliente_municipio = entity.getCliente_municipio();
		cliente_estado = entity.getCliente_estado();
		cliente_pais = entity.getCliente_pais();
		cliente_cep = entity.getCliente_cep();
		cliente_fone = entity.getCliente_fone();
		cliente_usuario = entity.getCliente_usuario();
		cliente_senha = entity.getCliente_senha();
//		pedidos = entity.getPedidos().stream().map(x -> new PedidoDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente_cpf() {
		return cliente_cpf;
	}

	public void setCliente_cpf(String cliente_cpf) {
		this.cliente_cpf = cliente_cpf;
	}

	public String getCliente_cnpj() {
		return cliente_cnpj;
	}

	public void setCliente_cnpj(String cliente_cnpj) {
		this.cliente_cnpj = cliente_cnpj;
	}

	public String getCliente_email() {
		return cliente_email;
	}

	public void setCliente_email(String cliente_email) {
		this.cliente_email = cliente_email;
	}

	public String getCliente_endereco() {
		return cliente_endereco;
	}

	public void setCliente_endereco(String cliente_endereco) {
		this.cliente_endereco = cliente_endereco;
	}

	public String getCliente_municipio() {
		return cliente_municipio;
	}

	public void setCliente_municipio(String cliente_municipio) {
		this.cliente_municipio = cliente_municipio;
	}

	public String getCliente_estado() {
		return cliente_estado;
	}

	public void setCliente_estado(String cliente_estado) {
		this.cliente_estado = cliente_estado;
	}

	public String getCliente_pais() {
		return cliente_pais;
	}

	public void setCliente_pais(String cliente_pais) {
		this.cliente_pais = cliente_pais;
	}

	public String getCliente_cep() {
		return cliente_cep;
	}

	public void setCliente_cep(String cliente_cep) {
		this.cliente_cep = cliente_cep;
	}

	public String getCliente_fone() {
		return cliente_fone;
	}

	public void setCliente_fone(String cliente_fone) {
		this.cliente_fone = cliente_fone;
	}

	public String getCliente_usuario() {
		return cliente_usuario;
	}

	public void setCliente_usuario(String cliente_usuario) {
		this.cliente_usuario = cliente_usuario;
	}

	public String getCliente_senha() {
		return cliente_senha;
	}

	public void setCliente_senha(String cliente_senha) {
		this.cliente_senha = cliente_senha;
	}

//	public List<PedidoDTO> getPedidos() {
//		return pedidos;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



}
