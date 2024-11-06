package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MarcaDao;
import com.example.demo.entity.Marca;
import com.example.demo.repository.MarcaRepository;


@Component
public class MarcaDaoImpl implements MarcaDao{
	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	public Marca create(Marca m) {
		// TODO Auto-generated method stub
		return marcaRepository.save(m);
	}

	@Override
	public Marca update(Marca m) {
		// TODO Auto-generated method stub
		return marcaRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		marcaRepository.deleteById(id);
		
	}

	@Override
	public Optional<Marca> getById(Long id) {
		// TODO Auto-generated method stub
		return marcaRepository.findById(id);
	}

	@Override
	public List<Marca> getAll() {
		// TODO Auto-generated method stub
		return marcaRepository.findAll();
	}

}
