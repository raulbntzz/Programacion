<?php
    
$numero1 = readline("Introduce el primer numero: ");
$numero2 = readline("Introduce el segundo numero: ");
$operacion = readline("Introduce la operacion a realizar (+, -, *, /, %, **)");

switch ($operacion) {
    case "+":
        $total = $numero1 + $numero2;
        echo "El total es de = " . $total;
        break;
    case "-":
        $total = $numero1 - $numero2;
        echo "El total es de = " . $total;
        break;
    case "*":
        $total = $numero1 * $numero2;
        echo "El total es de = " . $total;
        break;
    case "/":
        if ($numero2 != 0) {
            $total = $numero1 / $numero2;
            echo "El total es de = " . $total;
            break;
        } else {
            echo "No se puede dividir por cero";
            break;
        }
    case "%":
        $total = $numero1 % $numero2;
        echo "El total es de = " . $total;
        break;
    case "**":
        $total = $numero1 ** $numero2;
        echo "El total es de = " . $total;
        break;
}
?>