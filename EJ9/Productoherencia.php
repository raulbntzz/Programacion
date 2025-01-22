<?php
    class Producto{
        private $nombre;
        private $precio;
        private $cantidad;

        public function __construct($nombre, $precio, $cantidad){
            $this->nombre = $nombre;
            $this->precio = $precio;
            $this->cantidad = $cantidad;
        }

        public function getNombre(){
            return $this->nombre;
        }

        public function getPrecio(){
            return $this->precio;
        }

        public function getCantidad(){
            return $this->cantidad;
        }

        public function mostrarDetalles(){
            echo "Nombre: " .$this->nombre. " Cantidad: " .$this->cantidad. " Precio: " .$this->precio. "€\n";
        }
    }

    class ProductoImportado extends Producto{
        private $impuesto;

        public function __construct($impuesto, $nombre, $precio, $cantidad){
            parent::__construct($nombre, $precio, $cantidad);
            $this->impuesto = $impuesto;
        }

        public function calcularPrecioFinal(){
            $total = $this->getPrecio() * $this->getCantidad();
            $totalImpuesto = $total + ($total * ($this->impuesto / 100));
            echo "El total es de " .$total. "€ mas el " .$this->impuesto. "%\n";
            echo "Queda un total de " .$totalImpuesto. "€";
        }

        public function mostrarDetalles(){
            parent::mostrarDetalles();
            echo $this->calcularPrecioFinal(). "\n";
        }
    }

    $producto = new Producto("Agua", "20", "2");
    $producto->mostrarDetalles();
    $producto = new ProductoImportado("21", "Avion", "20", "2");
    $producto->mostrarDetalles();
?>