package com.cl3.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.back.dao.DocenteRepository;
import com.cl3.back.entity.Docente;




@Service
public class DocenteService {
	@Autowired
	private DocenteRepository repo;
	
	public void registrar(Docente bean) {
		repo.save(bean);
	}
	
	public void actualizar(Docente bean) {
		repo.save(bean);
	}
	
	public Docente buscar(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
	
	public List<Docente> listarTodos(){
		return repo.findAll();
	}
	
	
}
