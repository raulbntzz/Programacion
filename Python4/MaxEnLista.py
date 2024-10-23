def encontrar_maximo(numeros):
    #Valor inicial de maximo 0 para poder decir que sea mayor o menor el numero
    maximo = 0
    for num in numeros:
        if num > maximo:
            maximo = num
    return maximo

#Lista donde escribir los numeros
print(encontrar_maximo([3, 5, 2, 9, 1]))