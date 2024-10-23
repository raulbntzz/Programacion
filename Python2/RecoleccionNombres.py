nombres = []
nombre = input("Escribe el primer nombre: ")

while True:
    nombres.append(nombre)
    nombre = input("Introduce otro nombre mas: ")
    if nombre == "fin":
        print(f"Los nombres ingresados son {nombres}")
        break
print("Lista de nombres:")
for nombre in nombres:
    print(f" - {nombre}")