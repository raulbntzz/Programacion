<?php
    class CuentaBancaria{
        private $titular;
        private $saldo;
        private $tipoCuenta;

        public function __construct($titular, $tipoCuenta){
            $this->titular = $titular;
            $this->tipoCuenta = $tipoCuenta;
            $this->saldo = 0;
        }

        public function depositar($cantidad){
            if ($cantidad > 0) {
                $this->saldo += $cantidad;
            } else {
                echo "No puedes depositar cantidades negativas";
            }
        }

        public function retirar($cantidad){
            if ($cantidad > 0) {
                if ($this->verificarSaldoSuficiente($cantidad)){
                    $this->saldo -= $cantidad;
                    echo "Dinero retirado correctamente";
                }
            } else {
                echo "No puedes retirar cantidades negativas\n";
            }
        }

        private function verificarSaldoSuficiente($cantidad){
            return $this->saldo >= $cantidad;
        }

        public function mostrarSaldo(){
            echo "El titular de la cuenta es: " .$this->titular. "\n";
            echo "El tipo de cuenta es: " .$this->tipoCuenta. "\n";
            echo "El saldo actual es de: " .$this->saldo. "€\n\n";
        }
    }

    $cuenta = new CuentaBancaria("Raúl Benítez", "Corriente");
    $cuenta->mostrarSaldo();
    $cuenta->depositar(20000);
    $cuenta->mostrarSaldo();
    $cuenta->retirar(5000);
    $cuenta->mostrarSaldo();
    $cuenta->retirar(5000);
    $cuenta->mostrarSaldo();
?>