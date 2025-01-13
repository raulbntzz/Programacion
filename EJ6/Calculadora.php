<?php
    class Calculadora {
        public $numero1;
        public $numero2;

        public function sumar(){
            $total = $this->numero1 + $this->numero2;
            echo "La suma de " .$this->numero1. " + " .$this->numero2. " = " .$total. "\n";
        }

        public function restar(){
            $total = $this->numero1 - $this->numero2;
            echo "La resta de " .$this->numero1. " - " .$this->numero2. " = " .$total. "\n";
        }

        public function multiplicar(){
            $total = $this->numero1 * $this->numero2;
            echo "La multiplicación de " .$this->numero1. " * " .$this->numero2. " = " .$total. "\n";
        }

        public function division(){
            if ($this->numero2 == 0) {
                echo "La división no se puede realizar ya que el divisor es = 0";
                exit;
            }   else {
                $total = $this->numero1 / $this->numero2;
                echo "La division de " .$this->numero1. " / " .$this->numero2. " = " .$total. "\n";
                exit;
            }
        }
    }

    $operacion = new Calculadora();
    $operacion->numero1 = "5";
    $operacion->numero2 = "5";
    $operacion->sumar();

    $operacion = new Calculadora();
    $operacion->numero1 = "5";
    $operacion->numero2 = "5";
    $operacion->restar();

    $operacion = new Calculadora();
    $operacion->numero1 = "5";
    $operacion->numero2 = "5";
    $operacion->multiplicar();

    $operacion = new Calculadora();
    $operacion->numero1 = "5";
    $operacion->numero2 = "0";
    $operacion->division();
?>