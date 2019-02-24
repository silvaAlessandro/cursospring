package br.com.casa.cursospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casa.cursospring.domain.Categoria;
import br.com.casa.cursospring.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catRepository;
	
	public Categoria buscarByCodigo(Integer id)
	{
		return catRepository.getOne(id);
	}

}
