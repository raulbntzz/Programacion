#Crear def para mostrar el menú
def menu_seleccion():
    print("MENÚ:")
    print("1 -Cuadrado")
    print("2 -Rectángulo")
    print("3 -Salir")

#Crear def para calcular lo requerido del cuadrado
def area_cuadrado(lado):
    return lado * lado
def perimetro_cuadrado(lado):
    return 4 * lado
def mostrar_cuadrado(lado):
    for i in range(lado):
        print(lado*"*")

#Crear def para calcular lo requerido del rectangulo
def area_rectangulo(base, altura):
    return base * altura
def perimetro_rectangulo(base, altura):  
    return (base + altura) * 2
def mostrar_rectangulo(base, altura):
    for i in range(altura):
        print(base*"*")

menu_seleccion()
forma = input("Introduce el valor que quieras solicitar: ")
while True:
    #Buscar el caso en el que nuestro valor introducido corresponda con una opción válida
    match forma:
        case "1":
            lado = int(input("Introduzca el lado del cuadrado: "))
            print("\n")
            mostrar_cuadrado(lado)
            print(f"El área del cuadrado es {area_cuadrado(lado)}")
            print(f"El perímetro del cuadrado es {perimetro_cuadrado(lado)}")
            print("\n")
            menu_seleccion()
            forma = input("Introduce el valor que quieras solicitar: ")
        case "2":
            base = int(input("Introduzca la base del rectangulo: "))
            altura = int(input("Introduzca la altura del rectangulo: "))
            print("\n")
            mostrar_rectangulo(base, altura)
            print(f"El área del rectángulo es {area_rectangulo(base, altura)}")
            print(f"El perímetro del rectángulo es {perimetro_rectangulo(base, altura)}")
            print("\n")
            menu_seleccion()
            forma = input("Introduce el valor que quieras solicitar: ")
        case "3":
            print("Has seleccionado salir")
            break
        #Si no es correcto, volver a preguntar el número
        case _:
            forma = input("Valor no valido, prueba de nuevo: ")