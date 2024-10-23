#Importamos la extension de random
import random

#Introducimos un def para crear el menú
def menu_seleccion():
    print("MENÚ:")
    print("1 -Piedra")
    print("2 -Papel")
    print("3 -Tijera")

#Creamos las variables para poder contar las victorias y derrotas ademas de las partidas jugadas
contadorpersona = 0
contadormaquina = 0
partidas = 0
opciones = ["piedra", "papel", "tijera"]
#Creamos un valor aleatorio 
aleatorio = random.randint(1,3)
menu_seleccion()
#Solo continuar si el total de partidas jugadas no supera las 3
while contadorpersona < 3 and contadormaquina < 3:
    valor = int(input("Introduce tu selección a continuación (1 - 3): "))
    aleatorio = random.randint(1,3)
    #Comprobamos todos los casos posibles en los que podriamos ganar, perder o empatar
    if valor == aleatorio:
        print(f"Has elegido {opciones[valor - 1]}")
        print(f"La máquina ha elegido {opciones[aleatorio - 1]}")
        print("Ésta ronda ha sido empate")
        partidas += 1
    elif (valor == 1 and aleatorio == 3) or (valor == 2 and aleatorio == 1) or (valor == 3 and aleatorio == 2):
        print(f"Has elegido {opciones[valor - 1]}")
        print(f"La máquina ha elegido {opciones[aleatorio - 1]}")
        print("Has ganado esta ronda")
        partidas += 1
        contadorpersona += 1
    elif (valor == 1 and aleatorio == 2) or (valor == 2 and aleatorio == 3) or (valor == 3 and aleatorio == 1):
        print(f"Has elegido {opciones[valor - 1]}")
        print(f"La máquina ha elegido {opciones[aleatorio - 1]}")
        print("Has perdido esta ronda")
        partidas += 1
        contadormaquina += 1
    else:
        valor = int(input("Valor introducido incorrecto, pruebe con otro (1 - 3): "))
#Mostrar el resultado final
print("")
print("La partida ha terminado, el resultado es: ")
print(f"Máquina: {contadormaquina}")
print(f"Tú: {contadorpersona}")
#Comprobar quien ha ganado la partida
if contadormaquina > contadorpersona:
    print("La máquina ha ganado la partida")
elif contadorpersona > contadormaquina:
    print("Has ganado la partida")
else:
    print("Habéis empatado la partida")