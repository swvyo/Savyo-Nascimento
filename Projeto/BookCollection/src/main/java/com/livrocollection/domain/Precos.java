package com.livrocollection.domain;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Precos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String preco;

	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "desejados_id")
	private Desejados desejados;

	public Precos () {}

	public Precos(String preco) {
		super();
		this.preco = preco;
	}

	public  String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Desejados getDesejados() {
		return desejados;
	}

	public void setDesejados(Desejados desejados) {
		this.desejados = desejados;
	}
	
	
	

}
