def suma_hasta_limite (limite):
    #Establecer inicio de cuenta en 0
    suma = 0
    for i in range(1, limite + 1):
        suma += i
        #Ir sumando 1 a i y a su vez, sumar todos los valores a "suma"
        i += 1
    return suma

#Pedir numero al usuario
establecer = int(input("Introduce el número hasta donde contar: "))
print(suma_hasta_limite(establecer))
