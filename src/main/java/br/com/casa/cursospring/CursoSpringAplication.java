package br.com.casa.cursospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.casa.cursospring.domain.Categoria;
import br.com.casa.cursospring.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoSpringAplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository catRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringAplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria c = new Categoria(1, "Informatica");
		Categoria c1 = new Categoria(2, "RH");
		Categoria c2 = new Categoria(3, "Escritorio");
		
		
		catRespository.saveAll(Arrays.asList(c, c1, c2));
	}

}
