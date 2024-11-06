package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ModeloDao;
import com.example.demo.entity.Modelo;
import com.example.demo.repository.ModeloRepository;
@Component
public class ModeloDaoImpl implements ModeloDao{
	
	@Autowired
	private ModeloRepository modeloRepository;

	@Override
	public Modelo create(Modelo m) {
		// TODO Auto-generated method stub
		return modeloRepository.save(m);
	}

	@Override
	public Modelo update(Modelo m) {
		// TODO Auto-generated method stub
		return modeloRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		modeloRepository.deleteById(id);
	}

	@Override
	public Optional<Modelo> getById(Long id) {
		// TODO Auto-generated method stub
		return modeloRepository.findById(id);
	}

	@Override
	public List<Modelo> getAll() {
		// TODO Auto-generated method stub
		return modeloRepository.findAll();
	}

}
