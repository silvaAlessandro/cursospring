package br.com.casa.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.casa.cursospring.domain.Categoria;
import br.com.casa.cursospring.services.CategoriaService;

@RestController
@RequestMapping(value="/curso/api")
public class CategoriaResources {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(method=RequestMethod.GET, value= "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id)
	{
		Categoria cat = service.buscarByCodigo(id);
		
		return ResponseEntity.ok().body(cat);
		
	}

}
