<?php
require_once '../Conexion/mysql.php';

// Creacion de la clase usuario
class Usuario {
    private $conexion;

    // Funcion _construct para conectar a la base de datos
    public function __construct() {
        $this->conexion = new Conexion();
    }

    // Funcion para agregar Usuario
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

    function agregarTarea($id_usuario, $nombre, $descripcion, $estado) {
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
    
    // Funcion para obtener los Usuarios existentes
    public function listarTarea() {
        // Consulta para obtener los Usuarios de la base de datos
        $query = "SELECT * FROM tareas";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
    }

    public function listarTareaPorID($id) {
        if (empty($id)) {
            throw new Exception("El ID proporcionado está vacío.");
        }
        // Consulta para obtener los Usuarios de la base de datos
        $query = "SELECT * FROM tareas WHERE id_usuario = $id";
        $resultado = $this->conexion->conexion->query($query);
        $usuarios = [];
        while ($fila = $resultado->fetch_assoc()) {
            $usuarios[] = $fila;
        }
        return $usuarios;
    }

    public function obtenerID($id_tarea) {
        // Consulta para obtener el usuario por id
        $query = "SELECT id_usuario FROM tareas WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id_tarea);
        $stmt->execute();
        $resultado = $stmt->get_result();
        return $resultado->fetch_assoc();
    }

    public function obtenerContraseñaPorId($email) {
        // Consulta para obtener el usuario por id
        $query = "SELECT id, nombre, password FROM usuarios WHERE correo = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("s", $email);
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
    public function eliminarTarea($id) {
        // Consulta para eliminar un usuario
        $query = "DELETE FROM tareas WHERE id = ?";
        $stmt = $this->conexion->conexion->prepare($query);
        $stmt->bind_param("i", $id);

        if ($stmt->execute()) {
            echo "Tarea eliminada con éxito.";
        } else {
            echo "Error al eliminar la tarea: " . $stmt->error;
        }

        $stmt->close();
    }
}
?>
