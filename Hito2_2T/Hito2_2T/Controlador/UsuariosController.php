<?php
require_once '../Modelo/class_usuario.php';

// Crear clase UsuariosController para tener mayor certeza del funcionamiento
class UsuariosController {
    private $modelo;

    //Crear un nuevo Usuario que sea "modelo"
    public function __construct() {
        $this->modelo = new Usuario();
    }

    // Funcion para Añadir un Usuario
    public function registrarUsuario($usuario, $email, $password) {
        $this->modelo->registrarUsuario($usuario, $email, $password);
    }

    // Funcion para Añadir una tarea
    public function agregarTarea($id, $nombre, $descripcion, $estado) {
        $this->modelo->agregarTarea($id, $nombre, $descripcion, $estado);
    }

    // Funcion para Listar las tareas
    public function listarTarea() {
        return $this->modelo->listarTarea();
    }

    // Funcion para Buscar una tarea específica
    public function listarTareaPorID($id) {
        return $this->modelo->listarTareaPorID($id);
    }

    // Funcion para Buscar un usuario específico
    public function obtenerID($id_tarea) {
        return $this->modelo->obtenerID($id_tarea);
    }
    
    // Funcion para Buscar un usuario específico
    public function obtenerContraseñaPorId($email) {
        return $this->modelo->obtenerContraseñaPorId($email);
    }

    public function obtenerCorreoPorCorreo($email) {
        return $this->modelo->obtenerCorreoPorCorreo($email);
    }
    
    // Funcion para Actualizar una tarea
    public function actualizarTarea($estado, $id) {
        $this->modelo->actualizarTarea($estado, $id);
    }

    // Funcion para Eliminar una tarea
    public function eliminarTarea($id) {
        $this->modelo->eliminarTarea($id);
    }
}
?>
