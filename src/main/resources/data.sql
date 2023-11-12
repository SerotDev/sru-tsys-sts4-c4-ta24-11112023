DROP TABLE IF EXISTS trabajadores;

CREATE TABLE trabajadores (
	id INT AUTO_INCREMENT PRIMARY KEY,
	dni VARCHAR(9),
	nombre VARCHAR(250),
	apellidos VARCHAR(250),
	trabajo ENUM('FRONTEND_DEVELOPER', 'BACKEND_DEVELOPER', 'FULLSTACK_DEVELOPER', 'DATA_ANALYST'),
	salario INT,
	fecha DATE
);

INSERT INTO trabajadores (dni, nombre, apellidos, trabajo, salario, fecha) VALUES ('12345678A', 'Sergi', 'Rodriguez Utge', 'FULLSTACK_DEVELOPER', 2300, NOW());
INSERT INTO trabajadores (dni, nombre, apellidos, trabajo, salario, fecha) VALUES ('23456789B', 'Nerea', 'Prados Mata', 'DATA_ANALYST', 3000, NOW());
INSERT INTO trabajadores (dni, nombre, apellidos, trabajo, salario, fecha) VALUES ('34567890C', 'Cristo', 'Martinez Fernandez', 'FRONTEND_DEVELOPER', 2000, NOW());
INSERT INTO trabajadores (dni, nombre, apellidos, trabajo, salario, fecha) VALUES ('45678901D', 'Alex', 'Ramos Puig', 'BACKEND_DEVELOPER', 2100, NOW());