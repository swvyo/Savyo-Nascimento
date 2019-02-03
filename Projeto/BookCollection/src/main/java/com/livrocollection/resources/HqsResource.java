package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Hqs;
import com.livrocollection.repository.HqsRepository;

@RestController
public class HqsResource {

	@Autowired
	private HqsRepository hqsRepository;
	
	@GetMapping("livros/hqs")
	public List<Hqs> getAllHqs(){
		
		List<Hqs> hqs = hqsRepository.findAll();
		return hqs;
	}
	
}
