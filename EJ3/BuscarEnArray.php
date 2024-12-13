<?php
$array = ["manzana", "naranja", "pera"];

function buscarElemento($array, $valor) {
    $posicion = array_search($valor, $array);
    if ($posicion !== false) {
        return $posicion;
    }
    throw new Exception("La fruta elegida no se encuentra en la lista de frutas");
}

try {
    echo buscarElemento($array, "sandia");
} catch (Exception $e) {
    echo $e->getMessage();
}
?>