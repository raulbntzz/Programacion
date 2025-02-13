<?php
// Si no está logeado, no dejar que acceda a ninguna pagina
session_start();
if ($_SESSION['usuario'] == '' || $_SESSION['password'] == ''){
    header('Location: login.php');
}

// Importamos el archivo de UsuariosController
require_once '../Controlador/UsuariosController.php';

// Obtiene el ID de la tarea desde la URL
$id_usuario = $_GET["id"];
$controller = new UsuariosController();

// Pide el id de usuario
$id = $controller->obtenerID($id_usuario);

// Elimina la tarea segun el ID de la tarea
$controller->eliminarTarea($id_usuario);

// Envía a la lista de tareas del usuario tras eliminar la tarea 
header("Location: lista_tareas.php?id=". $id['id_usuario']);
exit();
?>
