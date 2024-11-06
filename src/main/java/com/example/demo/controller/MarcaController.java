package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Marca;
import com.example.demo.service.MarcaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/marcas")
@CrossOrigin(origins = "http://localhost:4200/")
public class MarcaController {
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping
	public ResponseEntity<List<Marca>> readAll() {
		try {
			List<Marca> marcas = marcaService.getAll();
			if (marcas.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(marcas, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Marca> crear(@Valid @RequestBody Marca ma) {
		try {
			Marca m = marcaService.create(ma);
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Marca> getEmpleadoId(@PathVariable Long id) {
		try {
			Marca m = marcaService.getById(id).get();
			return new ResponseEntity<>(m, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Marca> delEmpleado(@PathVariable Long id) {
		try {
			marcaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Marca> updateEmpleado(@PathVariable Long id, @Valid @RequestBody Marca ma) {
		Optional<Marca> m = marcaService.getById(id);
		if (m.get().getId()>0) {
			return new ResponseEntity<>(marcaService.update(ma), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
