<?php
    class Usuario{
        private $nombre;
        private $email;

        public function __construct($nombre, $email){
            $this->nombre = $nombre;
            $this->email = $email;
        }

        public function mostrarInfo(){
            echo "El nombre del usuario es: " .$this->nombre. "\n";
            echo "El email del usuario es: " .$this->email. "\n";
        }
    }

    class Administrador extends Usuario {
        public $nivelAcceso;

        public function __construct($nombre, $email, $nivelAcceso){
            parent::__construct($nombre, $email);
            $this->nivelAcceso = $nivelAcceso;
        }

        public function mostrarInfo(){
            parent::mostrarInfo();
            echo "El nivel de acceso del usuario es: " .$this->nivelAcceso. "\n";
        }
    }

    $cuenta = new Usuario("Raúl Benítez", "raul.benitezmulas24@campusfp.es");
    $cuenta->mostrarInfo();

    $cuenta = new Administrador("Raúl Benítez", "raul.benitezmulas24@campusfp.es", "Director");
    $cuenta->mostrarInfo();
?>