CREATE DATABASE cine_RaulBenitez;
USE cine_RaulBenitez;

CREATE TABLE peliculas (
	idPelicula INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    director VARCHAR(50) NOT NULL,
    anoPelicula INT NOT NULL
);

CREATE TABLE genero (
	idValoracion INT PRIMARY KEY,
    idPelicula INT,
    genero VARCHAR(50),
    FOREIGN KEY (idPelicula) REFERENCES peliculas(idPelicula)
);

INSERT INTO peliculas (idPelicula, nombre, director, anoPelicula) VALUES
(1, 'El Padrino', 'Francis Ford Coppola', 1972),
(2, 'Titanic', 'James Cameron', 1997),
(3, 'Matrix', 'Lana Wachowski', 1999),
(4, 'El Señor de los Anillos', 'Peter Jackson', 2001),
(5, 'Pulp Fiction', 'Quentin Tarantino', 1994);

INSERT INTO genero (idValoracion, idPelicula, genero) VALUES
(1, 1, 'Crimen'),
(2, 2, 'Romance'),
(3, 3, 'Ciencia Ficción'),
(4, 4, 'Fantasía'),
(5, 5, 'Crimen');