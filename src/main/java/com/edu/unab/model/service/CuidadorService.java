package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Cuidador;

public interface CuidadorService {
	
	public Iterable<Cuidador>findAll();
	public Optional<Cuidador>findById(Integer id);
	public Cuidador save(Cuidador c);
	public void deleteById(Integer id);
}


