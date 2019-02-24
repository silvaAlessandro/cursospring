package br.com.casa.cursospring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.casa.cursospring.domain.Categoria;

@RestController
@RequestMapping(value="/curso/api")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET, path="/listar")
	public List<Categoria> primeiroRest()
	{
		Categoria cat1 = new Categoria(1, "Curso");
		Categoria cat2 = new Categoria(2, "Teste");
		
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(cat1);
		listaCategoria.add(cat2);
		
		return listaCategoria;
		
	}

}
