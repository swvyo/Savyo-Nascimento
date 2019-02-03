package com.livrocollection.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.livrocollection.domain.Livro;
import com.livrocollection.repository.LivroRepository;

@RestController
public class LivroResource {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping("/livros")
	public List<Livro> getAllLivro(){
		List<Livro> livros = repository.findAll();
		
		return livros;
	}
	
	@PostMapping("/livros")
	
	public ResponseEntity<?> saveLivro(@RequestBody Livro livro){
		Livro savedLivro = repository.save(livro);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedLivro.getId()).
				toUri();
		
		return ResponseEntity.created(uri).body("ID do Livro e Nome: " 
		+ savedLivro.getId()+ " - "  + savedLivro.getNome());
		
	}
	
	@PutMapping ("/livros/{id}")
	public ResponseEntity<?> updateLivro(@RequestBody Livro livro, @PathVariable int id){
		Optional<Livro> livroFound = repository.findById(id);
		
		if (!livroFound.isPresent())
			return ResponseEntity.notFound().build();
		
		livro.setId(id);
		repository.save(livro);
		
		return ResponseEntity.noContent().build();

	}
	
	@DeleteMapping("/livros/{id}")
	public void deleteLivro(@PathVariable int id) {
		Optional<Livro> livroFound = repository.findById(id);
		
		if (livroFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	

}
