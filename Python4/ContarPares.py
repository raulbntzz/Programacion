def contar_pares(numeros):
    #Sumar 1 por cada numero par que haya
    return sum(1 for num in numeros if num % 2 == 0)

#Lista donde escribir los numeros
print(contar_pares([1, 2, 3, 4, 5, 6]))
