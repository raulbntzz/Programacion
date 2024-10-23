def multiplicar_a_lista(numeros):
    return numeros * 2
    
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
precios_multiplicados = list(map(multiplicar_a_lista, numeros))
print(precios_multiplicados)