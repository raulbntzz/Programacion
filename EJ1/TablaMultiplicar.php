<?php

$numero = readline("Introduce el numero de la tabla que quiera ver: ");

for ($i = 1; $i <= 10; $i++) {
    $total = $i * $numero;
    echo $numero . ' * ' . $i . ' = ' . $total . "\n";
}

?>