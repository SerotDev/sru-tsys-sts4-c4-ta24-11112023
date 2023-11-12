package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Trabajador;

public interface ITrabajadorService {
	//Listar todos
		public List<Trabajador> listarTrabajadores();
		
		//Listar por id
		public Trabajador trabajadorXID(Integer id); 
		
		//Guardar
		public Trabajador guardarTrabajador(Trabajador trabajador);
		
		//Actualizar
		public Trabajador actualizarTrabajador(Trabajador trabajador);
		
		//Eliminar
		public void eliminarTrabajador(Integer id);
}
