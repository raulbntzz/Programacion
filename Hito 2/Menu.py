import Cliente, Comprar, Elegir

def elegir_tabla():
    print()
    print("=== Gestión de Tablas ===")
    print("Seleccione una opción:")
    print("1- Cliente")
    print("2- Pedidos")
    print("3- Salir")

def elegir_opcion():
    elegir_tabla()
    elegir = int(input("Introduce una opción del menú: "))
    return elegir

def salir():
    print("Gracias por usar el programa")
    return exit()

def main(): 
    while True:
        elegir_tabla()
        elegir = int(input("Introduce una opción del menú: "))
        match elegir:
            case 1:
                while True:
                    Cliente.tabla_cliente()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            Cliente.crear_cliente()
                        case 2:
                            Cliente.leer_cliente()
                        case 3:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 2:
                while True:
                    Comprar.tabla_compras()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            Comprar.realizar_compra()
                        case 2:
                            Comprar.seguimiento_pedido()
                        case 3:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 3:
                salir()
            case _:
                print("Introduce un valor válido")