package com.livrocollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livrocollection.domain.LivroProximo;

public interface LivroProximoRepository extends JpaRepository<LivroProximo, Integer> {

}
