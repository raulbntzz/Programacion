<?php
require_once '../modelo/class_usuario.php';

// Crear clase UsuariosController para tener mayor certeza del funcionamiento
class UsuariosController {
    private $modelo;

    //Crear un nuevo Usuario que sea "modelo"
    public function __construct() {
        $this->modelo = new Usuario();
    }

    // Funcion para Agregar un Usuario
    public function agregarUsuario($nombre, $apellidos, $correo, $edad, $plan_base, $duracion, $paquete) {
        $this->modelo->agregarUsuario($nombre, $apellidos, $correo, $edad, $plan_base, $duracion, $paquete);
    }

    // Funcion para Listar los Usuarios
    public function listarUsuarios() {
        return $this->modelo->obtenerUsuarios();
    }

    // Funcion para Listar los Packs
    public function listarPack() {
        return $this->modelo->obtenerPack();
    }

    // Funcion para Buscar un usuario específico
    public function obtenerUsuarioPorId($id_cliente) {
        return $this->modelo->obtenerUsuarioPorId($id_cliente);
    }

    // Funcion para Actualizar un usuario
    public function actualizarUsuario($id_usuario, $paquete, $plan_base, $duracion) {
        $this->modelo->actualizarUsuario($id_usuario, $paquete, $plan_base, $duracion);
    }

    // Funcion para Eliminar un usuario
    public function eliminarUsuario($id_usuario) {
        $this->modelo->eliminarUsuario($id_usuario);
    }
}
?>
