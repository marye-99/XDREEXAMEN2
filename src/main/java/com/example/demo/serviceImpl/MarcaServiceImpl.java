package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CocheDao;
import com.example.demo.dao.MarcaDao;
import com.example.demo.entity.Marca;
import com.example.demo.service.MarcaService;
@Service
public class MarcaServiceImpl implements MarcaService {
	@Autowired
	private MarcaDao marcaDao;
	
	@Override
	public Marca create(Marca m) {
		// TODO Auto-generated method stub
		return marcaDao.create(m);
	}

	@Override
	public Marca update(Marca m) {
		// TODO Auto-generated method stub
		return marcaDao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		marcaDao.delete(id);
	}

	@Override
	public Optional<Marca> getById(Long id) {
		// TODO Auto-generated method stub
		return marcaDao.getById(id);
	}

	@Override
	public List<Marca> getAll() {
		// TODO Auto-generated method stub
		return marcaDao.getAll();
	}

}
