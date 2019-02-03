package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Precos;
import com.livrocollection.repository.PrecosRepository;

@RestController
public class PrecoResource {
	
	@Autowired
	private PrecosRepository precosRepository;
	
	@GetMapping ("/livros/desejados/precos")
	public List<Precos> getAllPrecos(){
		
		List<Precos> precos = precosRepository.findAll();
		return precos;
	}

}
