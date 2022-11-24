package com.cl3.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cl3.back.entity.Categoria;
import com.cl3.back.entity.Docente;
import com.cl3.back.service.CategoriaService;
import com.cl3.back.service.DocenteService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/docente")
public class DocenteController {
	@Autowired
	private DocenteService servicio;
	@Autowired
	private CategoriaService servicioCat;
	
	
	@GetMapping("/lista")
	public List<Docente> lista(){
		return servicio.listarTodos();
	}
	@GetMapping("/listaCategoria")
	public List<Categoria> listaCategoria(){
		return servicioCat.listarTodos();
	}
	
	@GetMapping("/buscar/{codigo}")
	public Docente buscar(@PathVariable("codigo") Integer cod){
		return servicio.buscar(cod);
	}

	@PostMapping("/registrar")
	public void registrar(@RequestBody Docente bean){
		servicio.registrar(bean);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Docente bean){
		servicio.actualizar(bean);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod){
		servicio.eliminar(cod);
	}
	
	
	
}
