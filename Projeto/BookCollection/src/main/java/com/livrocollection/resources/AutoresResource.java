package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Autores;
import com.livrocollection.repository.AutoresRepository;

@RestController
public class AutoresResource {
	
	@Autowired
	private AutoresRepository autoresRepository;
	
	@GetMapping ("/livros/autores")
	public List<Autores> getAllAutores (){
		List<Autores> autores = autoresRepository.findAll();
		return autores;
	}
	
}
