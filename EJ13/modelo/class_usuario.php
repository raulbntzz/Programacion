<?php
require_once '../config/conexion.php';

// Creacion de la clase usuario
class Usuario {
    private $conexion;

    // Funcion _construct para conectar a la base de datos
    public function __construct() {
        $this->conexion = new Conexion();
    }

    // Funcion para agregar Usuario
    public function agregarReceta($nombre_receta, $message) {
        $query = "INSERT INTO Receta (nombre_receta, descripcion_receta) VALUES (?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ss", $nombre_receta, $message);

        if ($stmt->execute()) {
            echo "Receta agregada con éxito.";
        } else {
            echo "Error al agregar la receta: " . $stmt->error;
        }

        $stmt->close();
    }

    // Funcion para obtener los Usuarios existentes
    public function listarRecetas() {
        $query = "SELECT * FROM Receta";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
        $resultado->close();
    }
    
    public function listarRecetasPorID($id_receta) {
        $query = "SELECT * FROM Receta WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_receta);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
        $stmt->close();
    }
    
    
    // Funcion para actualizar un usuario
    public function actualizarReceta($id_receta, $nombre, $descripcion) {
        $query = "UPDATE Receta SET nombre_receta = ?, descripcion_receta = ? WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssi", $nombre, $descripcion, $id_receta);
        $stmt->execute();
        $stmt->close();
    }

    // Funcion para eliminar un usuario
    public function eliminarReceta($id_receta) {
        // Consulta para eliminar un usuario
        $query = "DELETE FROM Receta WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_receta);

        if ($stmt->execute()) {
            echo "Receta eliminada con éxito.";
        } else {
            echo "Error al eliminar la tarea: " . $stmt->error;
        }

        $stmt->close();
    }
}
?>
