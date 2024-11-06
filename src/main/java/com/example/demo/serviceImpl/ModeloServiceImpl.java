package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CocheDao;
import com.example.demo.dao.ModeloDao;
import com.example.demo.entity.Modelo;
import com.example.demo.service.ModeloService;
@Service
public class ModeloServiceImpl implements ModeloService  {
	@Autowired
	private ModeloDao modeloDao;

	@Override
	public Modelo create(Modelo m) {
		// TODO Auto-generated method stub
		return modeloDao.create(m);
	}

	@Override
	public Modelo update(Modelo m) {
		// TODO Auto-generated method stub
		return modeloDao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		modeloDao.delete(id);
	}

	@Override
	public Optional<Modelo> getById(Long id) {
		// TODO Auto-generated method stub
		return modeloDao.getById(id);
	}

	@Override
	public List<Modelo> getAll() {
		// TODO Auto-generated method stub
		return modeloDao.getAll();
	}

}
