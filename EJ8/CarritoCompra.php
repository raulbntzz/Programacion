<?php
    class Carrito {
        public $productos = [];
        
        public function agregarProducto($nombre, $precio, $cantidad){
            $this->productos[] = [
                'nombre' => $nombre,
                'precio' => $precio,
                'cantidad' => $cantidad,
            ];
        }

        public function retirarProducto($nombre){
            $nuevosProductos = [];

            foreach ($this->productos as $producto) {
                if ($producto['nombre'] != $nombre) {
                    $nuevosProductos[] = $producto;
                }
            }

            $this->productos = $nuevosProductos;
        }

        public function calcularTotal(){
            $precioTotal = 0;

            foreach ($this->productos as $producto) {
                $precioTotal= $precioTotal + ($producto['precio'] * $producto['cantidad']);
            }

            echo "\n El precio total es de " .$precioTotal. "€";
        }

        public function mostrarDetalle(){
            foreach ($this->productos as $producto){
                echo "-" . $producto['nombre'] . " Precio: " . $producto['precio'] . "€ Cantidad: " . $producto['cantidad'] . "\n";
            }
        }
        
    }

    $carrito = new Carrito();

    $carrito->agregarProducto("Manzanas", "20", "5");
    $carrito->agregarProducto("Platanos", "2", "8");
    $carrito->agregarProducto("Naranjas", "15", "6");
    $carrito->agregarProducto("Peras", "10", "7");
    $carrito->agregarProducto("Sandías", "5", "12");
    $carrito->agregarProducto("Uvas", "8", "9");
    $carrito->agregarProducto("Fresas", "12", "4");

    $carrito->mostrarDetalle();
    $carrito->calcularTotal();
?>