agenda = {}
nombre = input("Introduce el nombre del contacto: ")
telefono = input("Introduce el telefono del contacto: ")

while nombre != "fin":
    agenda[nombre] = telefono
    nombre = input("Introduce el nombre del contacto: ")
    if nombre != "fin":
        telefono = input("Introduce el telefono del contacto: ")

print (agenda)
elegir = input("Inserta el nombre del usuario que quieres buscar: ")
print(f"El teléfono de {elegir} es {agenda[elegir]}")