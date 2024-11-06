package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Coche;

public interface CocheRepository extends JpaRepository<Coche, Long>{

}
