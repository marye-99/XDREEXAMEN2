package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Modelo;


public interface ModeloDao {
	Modelo create(Modelo m);
	Modelo update(Modelo m);
	void delete(Long id);
	Optional<Modelo> getById(Long id);
	List<Modelo> getAll();

}
