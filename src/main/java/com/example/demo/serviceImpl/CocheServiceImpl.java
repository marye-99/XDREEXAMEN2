package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CocheDao;
import com.example.demo.entity.Coche;
import com.example.demo.service.CocheService;

@Service
public class CocheServiceImpl implements CocheService{
	@Autowired
	private CocheDao cocheDao;
	
	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return cocheDao.create(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return cocheDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cocheDao.delete(id);
	}

	@Override
	public Optional<Coche> getById(Long id) {
		// TODO Auto-generated method stub
		return cocheDao.getById(id);
	}

	@Override
	public List<Coche> getAll() {
		// TODO Auto-generated method stub
		return cocheDao.getAll();
	}

}
