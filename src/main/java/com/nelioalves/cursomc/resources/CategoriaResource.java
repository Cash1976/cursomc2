package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//@Autowired
	//private CategoriaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	//@RequestMapping(value="/{id}", method=RequestMethod.GET)
	//public String listar() {
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
	
	//public ResponseEntity<?> find(@PathVariable Integer id) {
		//Categoria obj = service.buscar(id);
		//return ResponseEntity.ok().body(obj);
		return lista;
	
	}
}
