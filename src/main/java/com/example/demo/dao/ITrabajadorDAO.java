package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Trabajador;
import com.example.demo.dto.Trabajo;

@Repository
public interface ITrabajadorDAO extends JpaRepository<Trabajador,Integer> {
	public List<Trabajador> findByTrabajo(Trabajo trabajo);
}
