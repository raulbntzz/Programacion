<?php
    class Libro {
        public $titulo;
        public $autor;
        public $num_pags;

        public function mostrar_info(){
            echo "El titulo del libro es " .$this->titulo. ", su autor es " .$this->autor. " y tiene " .$this->num_pags. "\n";
        }
    }

    $libro = new Libro();
    $libro->titulo = "Quijote";
    $libro->autor = "Cervantes";
    $libro->num_pags = "700";

    $libro->mostrar_info();
?>