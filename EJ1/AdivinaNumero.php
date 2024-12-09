<?php
$numero = readline("Introduce un número del 1 al 6: ");
$aleatorio = rand(1, 6);

while (True) {
    if ($numero != $aleatorio){
        $numero = readline("Introduce un número del 1 al 6: ");
    } else {
        echo "¡Lo has acertado!";
        break;
    }
}
?>