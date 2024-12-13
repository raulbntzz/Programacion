<?php
function ConvertirTemperatura($valor, $unidad) {
    switch ($unidad) {
        case "F":
            $total = ($valor - 32) * 5/9;
            return $total . " ºC";
        case "C":
            $total = ($valor * 9/5) + 32;
            return $total . " ºF";
        default:
            throw new Exception("La unidad elegida no es correcta, debe ser (C o F)");
    } 
}

$valor = readline("Introduce el valor de la temperatura: ");
$unidad = readline("Introduce la unidad de la temperatura (C o F): ");

try {
    echo ConvertirTemperatura($valor, $unidad);
} catch (Exception $e) {
    echo $e->getMessage();
}

?>