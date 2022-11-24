package com.cl3.back.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cl3.back.entity.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
