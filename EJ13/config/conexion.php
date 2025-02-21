<?php
// Crear la clase conexión con mysqli
class Conexion {
    // Establecer datos
    private $servidor = 'localhost';
    private $usuario = 'root';
    private $password = 'curso';
    private $base_datos = 'Recetas';
    public $conexion;

    public function __construct() {
        // Establecer la conexión
        $this->conexion = new mysqli($this->servidor, $this->usuario, $this->password, $this->base_datos);

        if ($this->conexion->connect_error) {
            die("Error de conexión: " . $this->conexion->connect_error);
        }
    }

    // Cerrar la conexión
    public function cerrar() {
        $this->conexion->close();
    }
}
?>
