<?php
    class Circulo {
        public $radio;

        public function calcularArea() {
            $total = $this->radio * $this->radio * 3.14;
            echo "El área del circulo es: " .$total;
        }
    }

    $circulo = new Circulo();
    $circulo->radio = "5";

    $circulo->calcularArea();
?>