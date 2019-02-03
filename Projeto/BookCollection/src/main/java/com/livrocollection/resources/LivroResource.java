package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Livro;
import com.livrocollection.repository.LivroRepository;

@RestController
public class LivroResource {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping("/livros")
	public List<Livro> getAllLivro() {
		
		List <Livro> livro = livroRepository.findAll();
		return livro;
	}

}
