<?php
require_once '../Modelo/class_usuario.php';

// Crear clase UsuariosController para tener mayor certeza del funcionamiento
class UsuariosController {
    private $modelo;

    //Crear un nuevo Usuario que sea "modelo"
    public function __construct() {
        $this->modelo = new Usuario();
    }

    // Funcion para Agregar un Usuario
    public function registrarUsuario($usuario, $email, $password) {
        $this->modelo->registrarUsuario($usuario, $email, $password);
    }

    public function agregarTarea($id, $nombre, $descripcion, $estado) {
        $this->modelo->agregarTarea($id, $nombre, $descripcion, $estado);
    }

    // Funcion para Listar los Usuarios
    public function listarTarea() {
        return $this->modelo->listarTarea();
    }
    
    public function listarTareaPorID($id) {
        return $this->modelo->listarTareaPorID($id);
    }

    public function obtenerID($id_tarea) {
        return $this->modelo->obtenerID($id_tarea);
    }
    
    // Funcion para Buscar un usuario específico
    public function obtenerContraseñaPorId($email) {
        return $this->modelo->obtenerContraseñaPorId($email);
    }

    // Funcion para Actualizar un usuario
    public function actualizarUsuario($id_usuario, $paquete, $plan_base, $duracion) {
        $this->modelo->actualizarUsuario($id_usuario, $paquete, $plan_base, $duracion);
    }

    // Funcion para Eliminar un usuario
    public function eliminarTarea($id) {
        $this->modelo->eliminarTarea($id);
    }
}
?>
