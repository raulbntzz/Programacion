<?php
// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';

// Obtiene el ID del usuario desde la URL
$id_usuario = $_GET["id"];
$controller = new UsuariosController();

// Eliminar el usuario con el ID
$id = $controller->obtenerID($id_usuario);
$controller->eliminarTarea($id_usuario);

// Envía a la lista de tareas tras eliminar el usuario
header("Location: lista_tareas.php?id=". $id['id_usuario']);
exit();
?>
