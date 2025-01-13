<?php
    class Rectangulo {
        public $base;
        public $altura; 

        public function calcularArea(){
            $total = $this->base * $this->altura;
            echo "El área del cuadrado con base " .$this->base. " y altura " .$this->altura. " es: " .$total. "\n";
        }
    }

    $persona = new Rectangulo();
    $persona->base = "5";
    $persona->altura = "5";

    $persona->calcularArea();
?>