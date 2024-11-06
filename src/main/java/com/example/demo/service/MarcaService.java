package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Marca;


public interface MarcaService {
	Marca create(Marca m);
	Marca update(Marca m);
	void delete(Long id);
	Optional<Marca> getById(Long id);
	List<Marca> getAll();
}
