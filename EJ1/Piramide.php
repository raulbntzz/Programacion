<?php
$altura = readline("Introduce la altura de la pirámide: ");

for ($i = 1; $i <= $altura; $i++) {
    echo str_repeat(" ", $altura - $i);

    for ($j = 1; $j <= $i; $j++) {
        echo $j . " ";
    }

    echo "\n";
}
?>