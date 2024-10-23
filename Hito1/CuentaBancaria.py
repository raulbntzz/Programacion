def menu_inicio():
    print("MENÚ:")
    print("1 -Ingresar Dinero")
    print("2 -Retirar Dinero")
    print("3 -Mostrar Saldo")
    print("4 -Estadísticas")
    print("5 -Salir")

#Establecer variables para contar las veces que se repite una acción
ingresos_totales = 0
retiradas_totales = 0
saldo_inicial = float(input("Introduce el saldo inicial de la cuenta: "))
#Comprobar si el valor del dinero introducido es correcto
if saldo_inicial < 0:
    print("El saldo inicial no puede ser negativo")
    saldo_inicial = float(input("Introduce de nuevo la cantidad inicial"))
else:
    menu_inicio()

operacion = int(input("¿Qué operación desea realizar?: "))
while True:
    match operacion:
        case 1:
            print("Has elegido la opción de ingresar dinero")
            ingreso = float(input("Introduce la cantidad a ingresar: "))
            if ingreso < 0:
                print("Valor incorrecto, no puedes ingresar valores negativos")
                ingreso = float(input("Introduce una cantidad correcta a ingresar: "))
            else:
                saldo_inicial += ingreso
                ingresos_totales += 1
            #Mostrar el menú y volver a preguntar por la acción a realizar
            menu_inicio()
            operacion = int(input("¿Qué operación desea realizar?: "))
        case 2:
            print("Has elegido la opción de retirar dinero")
            retirar = float(input("Introduce la cantidad a retirar: "))
            if retirar < 0:
                print("Valor incorrecto, no puedes retirar valores negativos")
            else:
                saldo_inicial -= retirar
                retiradas_totales += 1
            #Mostrar el menú y volver a preguntar por la acción a realizar
            menu_inicio()
            operacion = int(input("¿Qué operación desea realizar?: "))
        case 3:
            #Mostrar el saldo actual
            print("Has elegido la opción de mostrar saldo")
            print(f"El saldo actual es {saldo_inicial}€")
            menu_inicio()
            operacion = int(input("¿Qué operación desea realizar?: "))
        case 4:
            #Mostrar el total de operaciones realizadas
            print("Has elegido la opción de estadísticas")
            print(f"Se ha ingresado dinero un total de {ingresos_totales} veces")
            print(f"Se ha retirado dinero un total de {retiradas_totales} veces")
            menu_inicio()
            operacion = int(input("¿Qué operación desea realizar?: "))
        case 5:
            #Elige la opción de salir por lo que rompe el while (acaba el código)
            print("Has elegido la opción de salir")
            break
        case _:
            #Si el valor introducido para elegir la opción no es correcto, se vuelve a preguntar indicando que el valor no es válido
            print("Opción no válida, porfavor, introduzca un número válido: ")
            menu_inicio()
            operacion = int(input("¿Qué operación desea realizar?: "))