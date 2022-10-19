package com.edu.unab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.unab.model.entity.Cuidador;
import com.edu.unab.model.service.CuidadorService;

@RestController
@RequestMapping("/api/cuidador")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CuidadorController {
	
	@Autowired
	private CuidadorService cuidadorservice;
	

	
	@PostMapping
	
	public Cuidador guardar(@RequestBody Cuidador cuidador) {
		
		return cuidadorservice.save(cuidador);
	}
	
	

	@GetMapping("/{id}")
	public Optional<Cuidador>buscarPorId(@PathVariable Integer id){
		
		return cuidadorservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Cuidador>listarTodos(){
		
		return cuidadorservice.findAll();
	}
	

	@DeleteMapping("{id}")

	public void eliminar(@PathVariable Integer id) {
		
		cuidadorservice.deleteById(id);
	}
	
	

}
