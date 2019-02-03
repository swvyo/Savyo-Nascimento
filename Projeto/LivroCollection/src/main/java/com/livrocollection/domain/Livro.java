package com.livrocollection.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private long isbn;
	
	private String idioma;
	
	private int ano;
	
	private String editora;
	
	private String edicao;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "livro")
	private List<Autores> autores;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "livro")
	private List<LivroProximo> proximos;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn (name = "register_id")
	private LivroFav livroFavorito;
	
	public Livro() {}

	public Livro(String nome, long isbn, String idioma, int anoLancamento, String editora, String edicao, int ano) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.idioma = idioma;
		this.ano = ano;
		this.editora = editora;
		this.edicao = edicao;
		this.autores = new ArrayList<Autores>();
		this.proximos = new ArrayList<LivroProximo>();
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getIsbn() {
		return isbn;
	}


	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}


	public List<Autores> getAutores() {
		return autores;
	}


	public void setAutores(List<Autores> autores) {
		this.autores = autores;
	}


	public LivroFav getLivroFavorito() {
		return livroFavorito;
	}


	public void setLivroFavorito(LivroFav livroFavorito) {
		this.livroFavorito = livroFavorito;
	}

	public List<LivroProximo> getProximos() {
		return proximos;
	}

	public void setProximos(List<LivroProximo> proximos) {
		this.proximos = proximos;
	}
	
}
