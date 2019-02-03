package com.livrocollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livrocollection.domain.LivroFav;

public interface LivroFavRepository extends JpaRepository<LivroFav, Integer> {

}
