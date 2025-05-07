DROP DATABASE IF EXISTS cine_RaulBenitez;
CREATE DATABASE cine_RaulBenitez;
USE cine_RaulBenitez;

CREATE TABLE peliculas (
	idPelicula INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    director VARCHAR(50) NOT NULL,
    anoPelicula INT NOT NULL
);

CREATE TABLE genero (
	idGenero INT PRIMARY KEY AUTO_INCREMENT,
    idPelicula INT,
    genero VARCHAR(50),
    FOREIGN KEY (idPelicula) REFERENCES peliculas(idPelicula) ON DELETE CASCADE
);