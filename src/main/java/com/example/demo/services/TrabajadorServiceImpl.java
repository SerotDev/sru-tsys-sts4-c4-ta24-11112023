package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITrabajadorDAO;
import com.example.demo.dto.Trabajador;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService {
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;

	// Listar todos
	public List<Trabajador> listarTrabajadores() {
		return iTrabajadorDAO.findAll();
	};

	// Listar por id
	public Trabajador trabajadorXID(Integer id) {
		return iTrabajadorDAO.findById(id).get();
	};

	// Guardar
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		return iTrabajadorDAO.save(trabajador);
	};

	// Actualizar
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		return iTrabajadorDAO.save(trabajador);
	};

	// Eliminar
	public void eliminarTrabajador(Integer id) {
		iTrabajadorDAO.deleteById(id);
	};
}
