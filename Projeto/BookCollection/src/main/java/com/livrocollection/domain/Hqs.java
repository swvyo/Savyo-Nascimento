package com.livrocollection.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hqs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cartunista;
	private String editora;
	
	public Hqs() {}

	public Hqs(String nome, String cartunista, String editora) {
		super();
		this.nome = nome;
		this.cartunista = cartunista;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCartunista() {
		return cartunista;
	}

	public void setCartunista(String cartunista) {
		this.cartunista = cartunista;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
