<?php
function TablaMultiplicar($numero) {
    if ($numero < 0 || $numero % 2 !== 0){
        throw new Exception("El número debe ser entero y positivo");
    } else {
        for ($i = 1; $i <= 10; $i++) {
            $total = $i * $numero;
            echo $i . ' * ' . $numero . ' = ' . $total . "\n";
        }
    }
}

$numero = readline("Introduce el numero de la tabla que quiera ver: ");
try {
    echo TablaMultiplicar($numero);
} catch (Exception $e) {
    echo $e->getMessage();
}

?>