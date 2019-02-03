package com.livrocollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livrocollection.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
