<?php
    class Vehiculo {
        public $marca;
        public $modelo;

        public function encender() {
            echo "El " . $this->marca . " " . $this->modelo . " se ha encendido";
        }
    }

    class Coche extends Vehiculo{
        public $modelo;
    }

    $coche = new Coche();
    $coche->marca = "Lamborghini";
    $coche->modelo = "Aventador SVJ";

    $coche->encender();
?>