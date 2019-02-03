package com.livrocollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livrocollection.domain.Favoritos;

public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {

}
