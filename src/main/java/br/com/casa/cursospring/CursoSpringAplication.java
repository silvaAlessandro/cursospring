package br.com.casa.cursospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.casa.cursospring.domain.Categoria;
import br.com.casa.cursospring.domain.Produto;
import br.com.casa.cursospring.repositories.CategoriaRepository;
import br.com.casa.cursospring.repositories.ProdutoRepository;

@SpringBootApplication
public class CursoSpringAplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository catRespository;
	
	@Autowired
	private ProdutoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringAplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria c = new Categoria(null, "Informatica");
		Categoria c2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "IMPRESSORA", 800.00);
		Produto p3 = new Produto(null, "MOUSE", 80.00);
		
		
		c.getListaProdutos().addAll(Arrays.asList(p1, p2, p3));
		c2.getListaProdutos().addAll(Arrays.asList(p2));
		
		p1.getListaCategorias().addAll(Arrays.asList(c));
		p2.getListaCategorias().addAll(Arrays.asList(c, c2));
		p3.getListaCategorias().addAll(Arrays.asList(c));
		
		
		catRespository.saveAll(Arrays.asList(c, c2));
		prodRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
