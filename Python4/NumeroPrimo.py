def es_primo(numero):
    #Descartamos que pueda ser divisible entre dos
    if numero % 2 == 0:
        return "No es primo" #Si es par
    else:
        return "Es primo" #Si es impar (primo)

#Introducir el numero
entrada = int(input("Introduce el número: "))
print(es_primo(entrada))