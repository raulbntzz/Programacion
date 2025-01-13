<?php
    class ConversorMoneda {
        public $moneda;
        public $cantidad; 

        public function DolaresAEuros(){
            if ($this->moneda == "Euros") {
                $this->EurosADolares();
            } elseif ($this->moneda == "Dolares") {
                $total = $this->cantidad * 0.98;
                echo "La cantidad en euros es: " .$total. "$\n";
            } else {
                echo "La moneda introducida no es correcta, pruebe de nuevo";
            }
        }

        public function EurosADolares(){
            if ($this->moneda == "Dolares") {
                $this->DolaresAEuros();
            } elseif ($this->moneda == "Euros") {
                $total = $this->cantidad * 1.02;
                echo "La cantidad en dólares es: " .$total. "€\n";
            } else {
                echo "La moneda introducida no es correcta, pruebe de nuevo";
            }
        }
    }

    $dinero = new ConversorMoneda();
    $dinero->moneda = "Euros";
    $dinero->cantidad = "1000";

    $dinero->DolaresAEuros();

?>