canciones = []
n = 0
cancion = input("Introduce el nombre de la cancion: ")

while cancion != "fin":
    canciones.append(cancion)
    cancion = input("Introduce la siguiente cancion: ")

for cancion in canciones:
    print(f" {n}º {cancion}" )
    n += 1

elegir = int(input("Inserte el número de la cancion a escoger: "))
print(f"Reproduciendo {canciones[elegir]}")