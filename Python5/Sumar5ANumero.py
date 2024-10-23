def sumar_a_lista(numeros):
    return numeros + 5
    
numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
precios_sumados = list(map(sumar_a_lista, numeros))
print(precios_sumados)