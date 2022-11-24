package com.cl3.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.back.dao.CategoriaRepository;
import com.cl3.back.dao.DocenteRepository;
import com.cl3.back.entity.Categoria;
import com.cl3.back.entity.Docente;




@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repoC;
	

	
	public List<Categoria> listarTodos(){
		return repoC.findAll();
	}
	
	
}
