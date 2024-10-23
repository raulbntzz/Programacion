ciudades = ("Madrid", "Barcelona", "Valencia", "Sevilla")
print("Ésta es la lista de ciudades que vamos a visitar: ")
for ciudad in ciudades:
    print(ciudad)
visitar = int(input("Ingresa la posición para saber qué ciudad visitarás: "))
visitar2 = visitar - 1
print(f"En la posicion {visitar}, visitarás {ciudades[visitar2]}")
