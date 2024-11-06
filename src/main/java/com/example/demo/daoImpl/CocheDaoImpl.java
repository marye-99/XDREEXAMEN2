package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CocheDao;
import com.example.demo.entity.Coche;
import com.example.demo.repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao{
	@Autowired
	private CocheRepository cocheRepository;

	@Override
	public Coche create(Coche c) {
		// TODO Auto-generated method stub
		return cocheRepository.save(c);
	}

	@Override
	public Coche update(Coche c) {
		// TODO Auto-generated method stub
		return cocheRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cocheRepository.deleteById(id);
	}

	@Override
	public Optional<Coche> getById(Long id) {
		// TODO Auto-generated method stub
		return cocheRepository.findById(id);
	}

	@Override
	public List<Coche> getAll() {
		// TODO Auto-generated method stub
		return cocheRepository.findAll();
	}

}
