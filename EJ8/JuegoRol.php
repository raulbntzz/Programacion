<?php
    class Personaje {
        public $nombre;
        public $nivel;
        public $vida;
        public $ataque;

        public function Atacar(Personaje $objetivo){
            $objetivo->vida -= $this->ataque;
            if ($objetivo->vida <= 0) {
                $objetivo->vida = 0;
                echo "El " .$objetivo->nombre . " ha muerto\n";
            } else {
                echo "El " .$objetivo->nombre . " ha sido atacado y tiene " .$objetivo->vida. " puntos de vida restantes\n";
            }
        }
        
        public function curar(){
            $vidaCurada = 25;
            $this->vida += $vidaCurada;
            echo "El " .$this->nombre . " se ha curado y ahora tiene " .$this->vida. " puntos de vida restantes\n";
        }

        public function subirNivel(){
            $nivelSubido = 1;
            $this->nivel += $nivelSubido;
            $ataqueAumentado = 0.2;
            $this->ataque = $this->ataque + ($this->ataque * $ataqueAumentado) ;
            echo "El " .$this->nombre . " ha subido a nivel " .$this->nivel. " y ahora hace " .$this->ataque. " puntos de daño\n";
        }
    }

    $mago = new Personaje();
    $mago->nombre = "Mago";
    $mago->nivel = "5";
    $mago->vida = "100";
    $mago->ataque = "50";

    $goku = new Personaje();
    $goku->nombre = "Zombie";
    $goku->nivel = "10";
    $goku->vida = "200";
    $goku->ataque = "99";

    $mago->Atacar($goku);
    $goku->subirNivel();
    $mago->Curar();
    $goku->Atacar($mago);
    $mago->Curar();
    $mago->Curar();
    $mago->Curar();
    $mago->subirNivel();
    $mago->subirNivel();
    $mago->subirNivel();
    $mago->subirNivel();
    $mago->subirNivel();
    $mago->subirNivel();
    $mago->Atacar($goku);
    $goku->Atacar($mago);
?>