caloriastotales = 0
pagartotal = 0
menu = {
    "Café": (1.5, 50),
    "Té": (1.0, 0),
    "Bocadillo": (3.0, 300),
    "Ensalada": (2.5, 150)
}
print(menu)
producto = input("Ingresa el nombre del producto que deseas agregar: ")
while producto != "fin":
    precio , calorias = menu[producto]
    pagartotal += precio
    caloriastotales += calorias
    producto = input("Ingresa el nombre del siguiente producto que deseas agregar: ")

print(f"El total a pagar es de {pagartotal} €")
print(f"El total de calorias es de {caloriastotales} kcal")