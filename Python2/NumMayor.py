numeros = []
mayor = 0
numero = input("Introduce un numero: ")

while numero != "hecho":
    numero = input("Introduce otro numero: ")
    if numero != "hecho":
        numeros.append(numero)
        for numero in numeros:
            if numero > numeros[0]:
                mayor = numero

print(mayor)