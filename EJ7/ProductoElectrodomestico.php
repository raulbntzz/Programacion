<?php
    class Producto {
        public $nombre;
        public $precio; 

        public function mostrarDetalles(){
            echo "El nombre de este producto es: " .$this->nombre. "\n";
            echo "Y su precio es de: " .$this->precio. "\n";
            echo "\n";
        }
    }

    class Electrodomestico extends Producto {
        public $consumo;

        public function mostrarDetalles(){
            echo "El nombre de este producto es: " .$this->nombre. "\n";
            echo "Y su precio es de: " .$this->precio. "€ \n";
            echo "Y su consumo es de: " .$this->consumo. "kWh \n";
            echo "\n";
        }
    }

    $producto = new Producto();
    $producto->nombre = "Lavavajillas";
    $producto->precio = "699";

    $producto->mostrarDetalles();

    $producto = new Electrodomestico();
    $producto->nombre = "Lavavajillas";
    $producto->precio = "699";
    $producto->consumo = "217";
    

    $producto->mostrarDetalles();
?>