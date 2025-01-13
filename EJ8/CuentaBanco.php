<?php
    class CuentaBancaria {
        public $titular;
        public $saldo;
        public $tipoCuenta;

        public function depositar($cantidad){
            if ($cantidad > 0) {
                $this->saldo += $cantidad;
                echo "El saldo ahora es de: " .$this->saldo. "\n";
            } else {
                echo "No se puede depositar una cantidad negativa o cero \n";
            }
        }

        public function retirar($cantidad){
            if ($cantidad > 0) {
                $this->saldo -= $cantidad;
                echo "El saldo ahora es de: " .$this->saldo. "\n";
            } else {
                echo "No se puede retirar una cantidad negativa o cero \n";
            }
        }

        public function mostrarInfo(){
            echo "El titular de la cuenta es: " .$this->titular. "\n";
            echo "El saldo actual de la cuenta es: " .$this->saldo. "\n";
            echo "El tipo de la cuenta es: " .$this->tipoCuenta. "\n";
        }
    }

    $cuenta = new CuentaBancaria();
    $cuenta->titular = "Raul";
    $cuenta->tipoCuenta = "Ahorros";
    $cuenta->saldo = "1000";

    $cuenta->depositar(500);
    $cuenta->retirar(500);
    $cuenta->mostrarInfo();
?>