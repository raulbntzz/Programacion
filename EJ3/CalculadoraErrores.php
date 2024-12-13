<?php
function suma($num1, $num2){
    return $num1 + $num2;
}
function resta($num1, $num2){
    return $num1 - $num2;
}
function multiplicacion($num1, $num2){
    return $num1 * $num2;
}
function division($num1, $num2){
    return $num1 / $num2;
}

$num1 = readline("Introduce el primer número: ");
$num2 = readline("Introduce el segundo número: ");
$operacion = readline("Introduce la operación que desea realizar (+, -, *, /): ");

switch ($operacion) {
    case "+":
        echo "El total es: " . suma($num1, $num2);
        break;
    case "-":
        echo "El total es: " . resta($num1, $num2);
        break;
    case "*":
        echo "El total es: " . multiplicacion($num1, $num2);
        break;
    case "/":
        if ($num2 == 0) {
            echo "No es posible realizar la operación ya que no se puede dividir entre 0";
        } else {
            echo "El total es: " . division($num1, $num2);
            break;
        }
    }
?>