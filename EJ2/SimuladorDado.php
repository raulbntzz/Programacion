<?php
function tirarDado() {
    $numero = rand(1, 6);
    return $numero;
}

$dado = tirarDado();
echo "La cara del dado es: " . $dado;
?>
