<?php
    class Empleado {
        public $nombre;
        public $sueldo;

        public function MostrarDetalles() {
            echo "El Sr./Sra." . $this->nombre . " cuenta con un sueldo de " . $this->sueldo . " € \n";
        }
    }

    class Gerente extends Empleado{
        public $departamento;

        public function MostrarDetalles() {
            echo "El Sr./Sra." . $this->nombre . " cuenta con un sueldo de " . $this->sueldo . " € y trabaja en el departamento de " .$this->departamento. "\n";
        }
    }

    $empleado = new Empleado();
    $empleado->nombre = "Daniel Gonzalez";
    $empleado->sueldo = "1000";

    $empleado->MostrarDetalles();

    $empleado = new Gerente();
    $empleado->nombre = "Daniel Gonzalez";
    $empleado->sueldo = "5000";
    $empleado->departamento = "Ventas";

    $empleado->MostrarDetalles();
?>