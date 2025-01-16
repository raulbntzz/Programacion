<?php
    class Empleado {
        public $nombre;
        public $sueldo;
        public $añosExperiencia;

        public function calcularBonus(){
            if ($this->añosExperiencia % 2 == 0) {
                $sueldoFinal = $this->sueldo+$this->sueldo*0.05*($this->añosExperiencia / 2);
                $this->sueldo = $sueldoFinal;
                echo "El sueldo final sumando los años es de: " .$sueldoFinal. "€\n\n";
            } else {
                $sueldoFinal = $this->sueldo+$this->sueldo*0.05*(($this->añosExperiencia - 1) / 2);
                $this->sueldo = $sueldoFinal;
                echo "El sueldo final sumando los años es de: " .$sueldoFinal. "€\n\n";
            }
        }

        public function mostrarDetalles(){
            echo "Nombre: " .$this->nombre. "\n";
            echo "Sueldo: " .$this->sueldo. "€\n";
            echo "Años Experiencia: " .$this->añosExperiencia. "\n";
        }
    }

    class Consultor extends Empleado {
        public $horasPorProyecto;

        public function calcularBonus(){
            if ($this->añosExperiencia % 2 == 0) {
                $sueldoFinal = $this->sueldo+$this->sueldo*0.05*($this->añosExperiencia / 2);
                $this->sueldo = $sueldoFinal;
            } else {
                $sueldoFinal = $this->sueldo+$this->sueldo*0.05*(($this->añosExperiencia - 1) / 2);
                $this->sueldo = $sueldoFinal;
            }

            if ($this->horasPorProyecto % 100 == 0) {
                $this->sueldo = $sueldoFinal;
                $sueldoFinal = $this->sueldo+$this->sueldo*0.02*($this->horasPorProyecto / 100);
                echo "El sueldo final sumando los años y las horas es de: " .$sueldoFinal. "€\n";
            } else {
                $this->sueldo = $sueldoFinal;
                $sueldoFinal = $this->sueldo+$this->sueldo*0.02*(round(($this->horasPorProyecto - 50) / 100));
                echo "El sueldo final sumando los años y las horas es de: " .$sueldoFinal. "€\n";
            }
        }

        public function mostrarDetalles(){
            echo "Nombre: " .$this->nombre. "\n";
            echo "Sueldo: " .$this->sueldo. "€\n";
            echo "Años Experiencia: " .$this->añosExperiencia. "\n";
            echo "Horas Por Proyecto: " .$this->horasPorProyecto. "\n";
        }
    }

    $empleado = new Empleado;
    $empleado->nombre = "Raul Benítez";
    $empleado->sueldo = "2000";
    $empleado->añosExperiencia = "20";

    $empleado->mostrarDetalles();
    $empleado->calcularBonus();

    $empleado = new Consultor;
    $empleado->nombre = "Raul Benítez";
    $empleado->sueldo = "2000";
    $empleado->añosExperiencia = "20";
    $empleado->horasPorProyecto = "100";

    $empleado->mostrarDetalles();
    $empleado->calcularBonus();
?>