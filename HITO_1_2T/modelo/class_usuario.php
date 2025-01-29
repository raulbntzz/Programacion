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
    public function agregarUsuario($nombre, $apellidos, $correo, $edad, $plan_base, $duracion, $paquete) {
        // Precios de los paquetes
        $preciosPaquetes = [
            'Deporte' => 6.99,
            'Cine' => 7.99,
            'Infantil' => 4.99
        ];

        // Consulta para crear usuario
        $query = "INSERT INTO usuarios (nombre, apellidos, correo, edad, plan_base, duracion) VALUES (?, ?, ?, ?, ?, ?)";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssssss", $nombre, $apellidos, $correo, $edad, $plan_base, $duracion);

        if ($stmt->execute()) {
            // Consulta para crear suscripciones
            $ultimo_id = $this->conexion->conexion->insert_id;
            foreach ($paquete as $item) {
                $precio = isset($preciosPaquetes[$item]) ? $preciosPaquetes[$item] : 10.00; 

                $querySuscripcion = "INSERT INTO suscripciones (id_usuario, paquete, precio) VALUES (?, ?, ?)";
                $stmtSuscripcion = $this->conexion->conexion->prepare($querySuscripcion);
                $stmtSuscripcion->bind_param("isd", $ultimo_id, $item, $precio);

                if (!$stmtSuscripcion->execute()) {
                    echo "Error al agregar la suscripción: " . $stmtSuscripcion->error;
                }
            }
            echo "Usuario y suscripción agregados con éxito.";
        } else {
            echo "Error al agregar al Usuario: " . $stmt->error;
        }

        $stmt->close();
    }

    // Funcion para obtener los Usuarios existentes
    public function obtenerUsuarios() {
        // Consulta para obtener los Usuarios de la base de datos
        $query = "SELECT * FROM usuarios";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
    }

    // Funcion para obtener los paquetes de cada usuario
    public function obtenerPack() {
        // Consulta para obtener los paquetes de los usuarios
        $query = "SELECT * FROM suscripciones";
        $resultado = $this->conexion->conexion->query($query);
        $suscripciones = [];
        while ($fila = $resultado->fetch_assoc()) {
            $suscripciones[] = $fila;
        }
        return $suscripciones;
    }

    // Funcion para buscar un usuario por un id específico
    public function obtenerUsuarioPorId($id_usuario) {
        // Consulta para obtener el usuario por id
        $query = "SELECT * FROM usuarios WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    // Funcion para actualizar un usuario
    public function actualizarUsuario($id_usuario, $paquete, $plan_base, $duracion) {
        // Precios de los paquetes
        $preciosPaquetes = [
            'Deporte' => 6.99,
            'Cine' => 7.99,
            'Infantil' => 4.99
        ];

        // Eliminar suscripciones anteriores
        $query = "DELETE FROM suscripciones WHERE id_usuario = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario);
        $stmt->execute();
        
        // Actualizar usuario
        $query = "UPDATE usuarios SET plan_base = ?, duracion = ? WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("ssi", $plan_base, $duracion, $id_usuario);
        $stmt->execute();

        // Insertar nuevas suscripciones
        foreach ($paquete as $item) {
            $precio = isset($preciosPaquetes[$item]) ? $preciosPaquetes[$item] : 10.00; 
            $querySuscripcion = "INSERT INTO suscripciones (id_usuario, paquete, precio) VALUES (?, ?, ?)";
            $stmtSuscripcion = $this->conexion->conexion->prepare($querySuscripcion);
            $stmtSuscripcion->bind_param("isd", $id_usuario, $item, $precio);
            $stmtSuscripcion->execute();
        }

        $stmt->close();
    }

    // Funcion para eliminar un usuario
    public function eliminarUsuario($id_usuario) {
        // Consulta para eliminar un usuario
        $query = "DELETE FROM usuarios WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_usuario);

        if ($stmt->execute()) {
            echo "Socio eliminado con éxito.";
        } else {
            echo "Error al eliminar socio: " . $stmt->error;
        }

        $stmt->close();
    }
}
?>
