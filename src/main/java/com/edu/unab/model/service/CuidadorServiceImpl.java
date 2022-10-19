package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Cuidador;
import com.edu.unab.repository.CuidadorRepository;

@Service
public class CuidadorServiceImpl implements CuidadorService {

	@Autowired
	private CuidadorRepository cuidadorRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Cuidador> findAll() {
	
		return cuidadorRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Cuidador> findById(Integer id) {
		
		return cuidadorRepository.findById(id);
	}

	@Override
	@Transactional
	public Cuidador save(Cuidador c) {
	
		return cuidadorRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		
		cuidadorRepository.deleteById(id);
		
	}

}
