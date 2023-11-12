package com.example.demo.dto;

public enum Trabajo {
	DATA_ANALYST(2500),
	FULLSTACK_DEVELOPER(1900),
	BACKEND_DEVELOPER(1600),
	FRONTEND_DEVELOPER(1500);

	int salario;

	Trabajo(int salario) {
		this.salario = salario;
	}

	public int getSalarioPorTrabajo() {
		return salario;
	}
}
