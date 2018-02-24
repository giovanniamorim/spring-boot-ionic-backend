package com.udemy.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.Endereco;
import com.udemy.cursomc.repositories.EnderecoRepository;
import com.udemy.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco buscar(Integer id) {
		Endereco obj = enderecoRepository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Não foi encontrado o endereço com o id: " + id + ". Tipo: " + Endereco.class.getName());
		}
		return obj;
	}

}
