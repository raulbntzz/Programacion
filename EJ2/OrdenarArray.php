<?php
function bubbleSort(array &$arr) {
    $n = count($arr);
    for ($i = 0; $i < $n; $i++) {
        for ($j = 0; $j < $n - $i - 1; $j++) {
            if ($arr[$j] > $arr[$j + 1]) {
                $temp = $arr[$j];
                $arr[$j] = $arr[$j + 1];
                $arr[$j + 1] = $temp;
            }
        }
    }
}

$arrayLength = 10;
$array = [];
for ($i = 0; $i < $arrayLength; $i++) {
    $array[] = rand(1, 100);
}

echo "Array original:\n";
print_r($array);

bubbleSort($array);

echo "\nArray ordenado:\n";
print_r($array);
?>
