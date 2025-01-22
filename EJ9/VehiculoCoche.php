<?php
    class Vehiculo{
        private $marca;
        private $modelo;

        public function __construct($marca, $modelo){
            $this->marca = $marca;
            $this->modelo = $modelo;
        }

        public function encender(){
            echo "El vehiculo se está encendiendo...\n";
        }

        public function getMarca(){
            return $this->marca;
        }

        public function getModelo(){
            return $this->modelo;
        }
    }

    class Coche extends Vehiculo {
        public $combustible;

        public function __construct($marca, $modelo, $combustible){
            parent::__construct($marca, $modelo);
            $this->combustible = $combustible;
        }

        public function mostrarDetalles(){
            echo "El vehiculo es marca: " .$this->getMarca(). "\n";
            echo "Y el modelo: " .$this->getModelo(). "\n";
            echo "El vehiculo es: " .$this->combustible. "\n";
        }
    }

    $cuenta = new Vehiculo("Raúl Benítez", "raul.benitezmulas24@campusfp.es");
    $cuenta->encender();

    $cuenta = new Coche("Ferrari", "F40", "Gasolina");
    $cuenta->mostrarDetalles();
?>