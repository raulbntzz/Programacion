<?php
    class Animal {
        public $especie;

        public function emitirSonido() {
            if ($this->especie == "perro") {
                echo "Guau guau! \n";
            } elseif ($this->especie == "gato") {
                echo "Miau miau! \n";
            } else {
                echo "Este animal no tiene un sonido definido.";
            }
        }
    }

    class Perro extends Animal{
        public $raza;

        public function mostrarInfo(){
            echo "Mi " .$this->especie. " es un " .$this->raza. "\n";
        }
    }

    $persona = new Perro();
    $persona->especie = "perro";
    $persona->raza = "Bulldog Francés";

    $persona->mostrarInfo();
    $persona->emitirSonido();
?>