<?php
require_once '../Controlador/UsuariosController.php';

$id_receta = $_GET["id"];
$controller = new UsuariosController();

// Elimina la tarea segun el ID de la tarea
$controller->eliminarReceta($id_receta);

// Envía a la lista de tareas del usuario tras eliminar la tarea 
header("Location: inicio.php");
exit();
?>
