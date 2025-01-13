<?php
    class Tarea {
        public $nombre;
        public $descripcion;
        public $fechaLimite;
        public $estado;

        public function marcarCompletada(){
            $this->estado = "Completada";
            echo "Descripción actualizada con exito\n";
        }

        public function editarDescripcion($nuevaDescripcion){
            $this->estado = $nuevaDescripcion;
            echo "Descripción actualizada con exito\n";
        }

        public function mostrarTarea(){
            echo "El nombre es: " .$this->nombre. "\n";
            echo "Descripción: " .$this->descripcion. "\n";
            echo "La fecha limite es: " .$this->fechaLimite. "\n";
            echo "El estado es: " .$this->estado. "\n\n";
        }
    }

    $Tarea = new Tarea();
    $Tarea->nombre = "Comprar zapatillas";
    $Tarea->descripcion = "Regalo para reyes";
    $Tarea->fechaLimite = "06/01/2025";
    $Tarea->estado = "Pendiente";

    $Tarea->editarDescripcion("Queda poco tiempo");
    $Tarea->mostrarTarea();
    $Tarea->marcarCompletada();
    $Tarea->mostrarTarea();
?>