<?php

$numero = readline("Introduce el numero que quiera comprobar: ");

for ($i = 2; $i < $numero ;$i++) {
    if ($numero % $i == 0) {
        echo 'El número no es primo';
        break;
    } else {
        echo 'El número es primo';
        break;
    }
}

?>