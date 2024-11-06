package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Coche;

public interface CocheDao {
	Coche create(Coche c);
	Coche update(Coche c);
	void delete(Long id);
	Optional<Coche> getById(Long id);
	List<Coche> getAll();

}
