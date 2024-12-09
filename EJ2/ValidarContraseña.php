<?php
function contarLetras($contraseña) {
    $total = strlen($contraseña);
    return $total;
}

function comprobarMayuscula($contraseña) {
    if (preg_match('/[A-Z]/', $contraseña) && preg_match('/[a-z]/', $contraseña) && preg_match('/[0-9]/', $contraseña)) {
        return True;
    } else {
        return False;
    }
}

$contraseña = readline("Introduce la contraseña a continuación: ");
if (contarLetras($contraseña) < 8){
    echo "Debe tener un minimo de 8 caracteres.";
} else {
    if (comprobarMayuscula($contraseña)) {
        echo "La contraseña introducida es correcta";
    } else {
        echo "La contraseña es incorrecta (debe tener una mayúscula y un número al menos)";
    }
}
?>