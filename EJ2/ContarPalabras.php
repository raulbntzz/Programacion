<?php
$frase = readline("Introduce la frase a continuación: ");
$contador = 0;
$longitud = strlen($frase);

for ($i = 0; $i < $longitud; $i++) {
    if ($frase[$i] == ' ' && $i + 1 < $longitud && $frase[$i + 1] != ' ') {
        $contador++;
    }
}

if ($longitud > 0 && $frase != ''){
    $contador++;
}

echo ("Hay un total de $contador palabras")
?>