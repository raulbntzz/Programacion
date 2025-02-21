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
    public function agregarReceta($nombre_receta, $message) {
        $this->modelo->agregarReceta($nombre_receta, $message);
    }

    // Funcion para Listar los Usuarios
    public function listarRecetas() {
        return $this->modelo->listarRecetas();
    }

    public function listarRecetasPorID($id_receta) {
        return $this->modelo->listarRecetasPorID($id_receta);
    }

    // Funcion para Actualizar un usuario
    public function actualizarReceta($id_receta, $nombre, $descripcion) {
        $this->modelo->actualizarReceta($id_receta, $nombre, $descripcion);
    }

    // Funcion para Eliminar un usuario
    public function eliminarReceta($id_receta) {
        $this->modelo->eliminarReceta($id_receta);
    }
}
?>
