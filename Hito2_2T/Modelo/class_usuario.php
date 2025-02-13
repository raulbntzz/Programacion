<?php
require_once '../Conexion/mysql.php';

// Creacion de la clase usuario
class Usuario {
    private $conexion;

    // Funcion _construct para conectar a la base de datos
    public function __construct() {
        $this->conexion = new Conexion();
    }

    // Funcion para añadir Usuario
    function registrarUsuario($usuario, $email, $password) {
        // Hashear la contraseña antes de almacenarla
        $passwordHash = password_hash($password, PASSWORD_BCRYPT);
    
        $query = "INSERT INTO usuarios (nombre, correo, password) VALUES (?, ?, ?)";
    
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("sss", $usuario, $email, $passwordHash);

        if ($stmt->execute()) {
            header("Location: ../Vistas/login.php");
        } else {
            echo "Error al registrar usuario: " . $stmt->error;
        }
    
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para añadir las tareas a la base de datos
    function agregarTarea($id_usuario, $nombre, $descripcion, $estado) {
        // Consulta para añadir las tareas a la base de datos
        $query = "INSERT INTO tareas (id_usuario, nombre, descripcion, estado) VALUES (?, ?, ?, ?)";
    
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("isss", $id_usuario, $nombre, $descripcion, $estado);

        if ($stmt->execute()) {
            header("Location: ../Vistas/lista_tareas.php");
        } else {
            echo "Error al añadir Tarea: " . $stmt->error;
        }
    
        // Cerrar la consulta preparada
        $stmt->close();
    }
    
    // Funcion para obtener las tareas
    public function listarTarea() {
        // Consulta para obtener las tareas de la base de datos
        $query = "SELECT * FROM tareas";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para listar las tareas por el id del usuario
    public function listarTareaPorID($id) {
        // Consulta para listar las tareas por el id del usuario
        $query = "SELECT * FROM tareas WHERE id_usuario = $id";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para obtener un id
    public function obtenerID($id_tarea) {
        // Consulta para obtener el id del usuario por id de la tarea
        $query = "SELECT id_usuario FROM tareas WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_tarea);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para obtener contraseña por email
    public function obtenerContraseñaPorId($email) {
        // Consulta para obtener la contraseña por el email
        $query = "SELECT id, nombre, password FROM usuarios WHERE correo = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $email);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para buscar un correo
    public function obtenerCorreoPorCorreo($email) {
        // Consulta para obtener el correo por el correo
        $query = "SELECT correo FROM usuarios WHERE correo = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $email);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para actualizar una tarea
    public function actualizarTarea($estado, $id) {
        // Consulta para actualizar la tarea
        $query = "UPDATE tareas SET estado = ? WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("si", $estado, $id);
        $stmt->execute();
        // Cerrar la consulta preparada
        $stmt->close();
    }

    // Funcion para eliminar una tarea
    public function eliminarTarea($id) {
        // Consulta para eliminar una tarea
        $query = "DELETE FROM tareas WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id);

        if ($stmt->execute()) {
            echo "Tarea eliminada con éxito.";
        } else {
            echo "Error al eliminar la tarea: " . $stmt->error;
        }

        // Cerrar la consulta preparada
        $stmt->close();
    }
}
?>
