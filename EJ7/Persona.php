<?php
    class Persona {
        public $nombre;
        public $edad;
        public $genero;

        public function presentar() {
            echo "Hola, soy " .$this->nombre. ", tengo " .$this->edad." años y soy un/a " .$this->genero. "\n";
        }
    }

    $persona = new Persona();
    $persona->nombre = "Raul";
    $persona->edad = "18";
    $persona->genero = "Helicóptero Soviético";

    $persona->presentar();
?>