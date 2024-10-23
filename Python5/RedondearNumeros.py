def redondear_lista(numeros):
    return round(numeros)
    
numeros = [1.5, 2.7, 3.8, 4.1, 5.9, 6.3, 7.5, 8.9, 9.4, 10.7]
numeros_redondeados = list(map(redondear_lista, numeros))
print(numeros_redondeados)

