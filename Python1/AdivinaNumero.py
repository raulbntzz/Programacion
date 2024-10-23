import random
numero = int(input("Prueba con un número del 1 al 100" + " "))
aleatorio = random.randint(1,100)

while numero != aleatorio:
    if numero < aleatorio:
        print("El número es mayor")
    elif numero > aleatorio:
        print("El número es menor")
    numero = int(input("Prueba con otro" + " "))

print(f"Enhorabuena, el número secreto era {aleatorio}")