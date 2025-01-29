<?php
// Importamos el archivo de UsuariosController
require_once '../controlador/UsuariosController.php';

// Obtiene el ID del usuario desde la URL
$id_usuario = $_GET["id"];
$controller = new UsuariosController();

// Eliminar el usuario con el ID
$controller->eliminarUsuario($id_usuario);

// Envía a la lista de usuarios tras eliminar el usuario
header("Location: lista_usuarios.php");
exit();
?>
