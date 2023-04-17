CREATE DATABASE IF NOT EXISTS mvc2;
USE mvc2;

CREATE TABLE clientes (
	id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(250) DEFAULT NULL,
    apellido varchar(250) DEFAULT NULL,
    direccion varchar(250) DEFAULT NULL,
    dni int(11) DEFAULT NULL,
    fecha date DEFAULT NULL
);

CREATE TABLE videos (
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	title varchar(250) DEFAULT NULL,
	director varchar(250) DEFAULT NULL,
	cli_id int DEFAULT NULL,
	FOREIGN KEY (cli_id) REFERENCES clientes(id)
);

INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) VALUES 
	('Roger', 'Gibert', 'Calle Falsa 123', 99818372, '1994-01-02'),
    ('Maria', 'Tella', 'Calle Larga 1', 88372162, '1964-12-30'),
    ('Anna', 'Lopez', 'Calle Real 321', 12345892, '1987-04-25'),
    ('Antonio', 'Martinez', 'Calle Lleca 23', 22385943, '1998-12-23'),
	('Rigoberto', 'Oberto', 'Avenida Benida 9', 46573959, '2022-02-02');

INSERT INTO videos (title, director) VALUES 
	('Mad Max: Fury Road', 'George Miller'),
	('300', 'Zack Snyder'),
	('Wacthmen', 'Zack Snyder'),
	('The Batman', 'Matt Reeves'),
	('The Dark Knight Rises', 'Christopher Nolan');
    
SELECT * FROM clientes;
    
SELECT * FROM videos;

DELETE From videos where id >0;

DROP TABLE videos;