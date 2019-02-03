package com.livrocollection.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livrocollection.domain.Favoritos;
import com.livrocollection.repository.FavoritosRepository;

@RestController
public class FavoritosResource {
	
	@Autowired
	private FavoritosRepository favoritosRepository;
	
	@GetMapping("/livros/favs")
	public List<Favoritos> getAllFavoritos(){
		
		List<Favoritos> favoritos = favoritosRepository.findAll();
		return favoritos;
	}

}
