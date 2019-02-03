package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Desejados;
import com.livrocollection.repository.DesejadosRepository;


@RestController
public class DesejadosResource {
	
	@Autowired
	private DesejadosRepository desejadosRepository;
	
	@GetMapping("/livros/desejados")
	public List<Desejados> getAllDesejados(){
		
		List<Desejados> desejados = desejadosRepository.findAll();
		return desejados;
	}
	
}
