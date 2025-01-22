<?php
    class Empleado{
        private $nombre;
        private $sueldo;
        private $puesto;

        public function __construct($nombre, $sueldo, $puesto){
            $this->nombre = $nombre;
            $this->sueldo = $sueldo;
            $this->puesto = $puesto;
        }

        public function setSueldo($nuevoSueldo){
            $this->sueldo = $nuevoSueldo;
        }

        public function getSueldo(){
            return $this->sueldo;
        }

        public function getNombre(){
            return $this->nombre;
        }

        public function getPuesto(){
            return $this->puesto;
        }

        public function mostrarDetalles(){
            echo "El nombre es: " .$this->nombre. ", es " .$this->puesto."\n";
            echo "Y cobra un total de: " .$this->getSueldo(). "€ \n";
        }
    }

    class Manager extends Empleado {
        public $departamento;

        public function __construct($nombre, $sueldo, $puesto, $departamento){
            parent::__construct($nombre, $sueldo, $puesto);
            $this->departamento = $departamento;
        }

        public function revisarEmpleado(Empleado $empleado){
            echo "El nombre es: " .$empleado->getNombre(). ", es " .$this->getPuesto(). " y trabaja en el departamento de " .$this->departamento. "\n";
            echo "Y cobra un total de: " .$this->getSueldo(). "€ \n";
        }
    }

    $raul = new Empleado("Raúl Benítez", "2000", "Director General");
    $raul->mostrarDetalles();
    $raul->setSueldo(5000);
    $raul->mostrarDetalles();

    $dani = new Manager("Raúl Benítez", "2000", "Director General", "Ventas");
    $dani->revisarEmpleado($raul);
?>