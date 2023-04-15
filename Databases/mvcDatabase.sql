CREATE DATABASE IF NOT EXISTS mvc;
USE mvc;

DROP TABLE clientes;

CREATE TABLE clientes (
	id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(250) DEFAULT NULL,
    apellido varchar(250) DEFAULT NULL,
    direccion varchar(250) DEFAULT NULL,
    dni int(11) DEFAULT NULL,
    fecha date DEFAULT NULL
);

INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES 
	('Roger', 'Gibert', 'Calle Falsa 123', 99818372, '1994-01-02'),
    ('Maria', 'Tella', 'Calle Larga 1', 88372162, '1964-12-30'),
    ('Anna', 'Lopez', 'Calle Real 321', 12345892, '1987-04-25'),
    ('Antonio', 'Martinez', 'Calle Lleca 23', 22385943, '1998-12-23'),
	('Rigoberto', 'Oberto', 'Avenida Benida 9', 46573959, '2022-02-02');


SELECT * FROM clientes;

DELETE FROM clientes where id > 0;

