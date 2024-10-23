numero = 0
suma = 0
contador = 0
numero = int(input("Introduce un numero: "))

while numero != 0:
    suma = suma + numero
    contador += 1
    numero = int(input("Introduce otro numero: "))
    
    
total = suma / contador
print(f"Has introducido un total de {contador} números")
print(f"La media es de {total}")