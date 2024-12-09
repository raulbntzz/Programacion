<?php
$nombres = ["Ana", "Pedro", "Luis", "María", "Carlos", "Isabel", "Jorge", "Laura"];
$apellidos = ["Gómez", "Pérez", "Rodríguez", "Martínez", "Sánchez", "López", "Torres", "Garcia"];

$indiceNombre = array_rand($nombres);
$indiceApellido = array_rand($apellidos);

$nombreCompleto = $nombres[$indiceNombre] . " " . $apellidos[$indiceApellido];

echo "Nombre completo aleatorio: " . $nombreCompleto;
?>
