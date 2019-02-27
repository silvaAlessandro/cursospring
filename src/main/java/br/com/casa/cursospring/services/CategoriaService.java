package br.com.casa.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.casa.cursospring.domain.Categoria;
import br.com.casa.cursospring.domain.security.JWTUtil;
import br.com.casa.cursospring.repositories.CategoriaRepository;
import br.com.casa.cursospring.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catRepository;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	public Categoria buscarByCodigo(Integer id)
	{
		Optional<Categoria> obj = catRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public String gerarScretToken(String nomeEmpresa)
	{
		String retorno = jwtUtil.generationToken(nomeEmpresa);
		return retorno;
	}

}
