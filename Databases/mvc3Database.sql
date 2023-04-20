CREATE DATABASE IF NOT EXISTS mvc3;
USE mvc3;

CREATE TABLE proyectos (
	id varchar(4) NOT NULL PRIMARY KEY,
	nombre varchar(255),
	horas int
);
	
CREATE TABLE cientificos (
	dni varchar(8) NOT NULL PRIMARY KEY,
	nomApels varchar(255)
);
	
CREATE TABLE asignadoA (
	id varchar(4) NOT NULL PRIMARY KEY,
	proyecto varchar(4) DEFAULT NULL,
	cientifico varchar(8) DEFAULT NULL,
	FOREIGN KEY (proyecto) REFERENCES proyectos (id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (cientifico) REFERENCES cientificos (dni) ON UPDATE CASCADE ON DELETE CASCADE
);
	

INSERT INTO proyectos (id, nombre, horas) VALUES 
	('a23r', 'Rayo Mortal X', 125),
	('b112', 'Rayo No Mortal Y', 2000),
	('y67j', 'Escudo de fotones', 800),
	('fr33', 'Jetpack Neutronico', 340),
	('ip00', 'Tenedor Cuantico', 575);
	
INSERT INTO cientificos (dni, nomApels) VALUES 
	('33275849', 'Lasien Tyffika'),
	('84738291', 'Profesor Frink'),
	('99826474', 'Victor Frankenstein'),
	('12674893', 'Fausto El Portugues'),
	('45637829', 'Hubert Farnsworth');
    
INSERT INTO asignadoA (id, proyecto, cientifico) VALUES
	('a1', 'a23r', '84738291'),
	('a2', 'b112', '33275849'),
	('a3', 'y67j', '45637829'),
	('a4', 'fr33', '99826474'),
	('a5', 'ip00', '12674893');