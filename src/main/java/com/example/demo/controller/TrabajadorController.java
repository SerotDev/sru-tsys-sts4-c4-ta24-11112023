package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Trabajador;
import com.example.demo.services.TrabajadorServiceImpl;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {

	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	@GetMapping("/all")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	
	@PostMapping("/add")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Integer id) {
		
		Trabajador trabajador_xid= new Trabajador();
		
		trabajador_xid=trabajadorServiceImpl.trabajadorXID(id);
		
		System.out.println("Trabajador X ID: "+trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Integer id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServiceImpl.trabajadorXID(id);
		
		trabajador_seleccionado.setDni(trabajador.getDni());
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setApellidos(trabajador.getApellidos());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		trabajador_seleccionado.setSalario(trabajador.getSalario());
		trabajador_seleccionado.setFecha(trabajador.getFecha());
		
		trabajador_actualizado = trabajadorServiceImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")Integer id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
		System.out.println("Trabajador eliminado");
	}
	
	
}