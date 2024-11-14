import DEF_MainCategoria, DEF_MainPedidos, DEF_MainClientes, DEF_MainProducto

def elegir_basedatos():
    print()
    print("=== Gestión de Tablas ===")
    print("Seleccione una opción:")
    print("1- Categorías")
    print("2- Pedidos")
    print("3- Clientes")
    print("4- Productos")
    print("5- Salir")

def elegir_opcion():
    mostrar_menu()
    elegir = int(input("Introduce una opción del menú: "))
    return elegir

def mostrar_menu():
    print()
    print("=== Gestión de Opciones ===")
    print("Seleccione una opción:")
    print("1- Crear")
    print("2- Leer existentes")
    print("3- Actualizar")
    print("4- Eliminar")
    print("5- Salir")

def main(): 
    elegir_basedatos()
    elegir_base = int(input("Introduce una opción del menú de tablas: "))
    while True:
        match elegir_base:
            case 1:
                mostrar_menu()
                elegir = int(input("Introduce una opción del menú: "))
                match elegir:
                    case 1:
                        DEF_MainCategoria.crear_categoria()
                        elegir = elegir_opcion()
                    case 2:
                        DEF_MainCategoria.leer_categorias()
                        elegir = elegir_opcion()
                    case 3:
                        DEF_MainCategoria.actualizar_categoria()
                        elegir = elegir_opcion()
                    case 4:
                        DEF_MainCategoria.eliminar_categoria()
                        elegir = elegir_opcion()
                    case 5:
                        DEF_MainCategoria.finalizar_programa()
                        elegir = elegir_opcion()
                    case _:
                        print("Porfavor introduzca una opción válida")
                        elegir = elegir_opcion()
            case 2:
                mostrar_menu()
                elegir = int(input("Introduce una opción del menú: "))
                match elegir:
                    case 1:
                        DEF_MainPedidos.crear_cliente()
                        elegir = elegir_opcion()
                    case 2:
                        DEF_MainPedidos.leer_cliente()
                        elegir = elegir_opcion()
                    case 3:
                        DEF_MainPedidos.actualizar_cliente()
                        elegir = elegir_opcion()
                    case 4:
                        DEF_MainPedidos.eliminar_cliente()
                        elegir = elegir_opcion()
                    case 5:
                        DEF_MainPedidos.finalizar_programa()
                        elegir = elegir_opcion()
                    case _:
                        print("Porfavor introduzca una opción válida")
                        elegir = elegir_opcion()
            case 3:
                mostrar_menu()
                elegir = int(input("Introduce una opción del menú: "))
                match elegir:
                    case 1:
                        DEF_MainClientes.crear_cliente()
                        elegir = elegir_opcion()
                    case 2:
                        DEF_MainClientes.leer_cliente()
                        elegir = elegir_opcion()
                    case 3:
                        DEF_MainClientes.actualizar_cliente()
                        elegir = elegir_opcion()
                    case 4:
                        DEF_MainClientes.eliminar_cliente()
                        elegir = elegir_opcion()
                    case 5:
                        DEF_MainClientes.finalizar_programa()
                        elegir = elegir_opcion()
                    case _:
                        print("Porfavor introduzca una opción válida")
                        elegir = elegir_opcion()
            case 4:
                mostrar_menu()
                elegir = int(input("Introduce una opción del menú: "))
                match elegir:
                    case 1:
                        DEF_MainProducto.crear_producto()
                        elegir = elegir_opcion()
                    case 2:
                        DEF_MainProducto.leer_producto()
                        elegir = elegir_opcion()
                    case 3:
                        DEF_MainProducto.actualizar_producto()
                        elegir = elegir_opcion()
                    case 4:
                        DEF_MainProducto.eliminar_producto()
                        elegir = elegir_opcion()
                    case 5:
                        DEF_MainProducto.finalizar_programa()
                        elegir = elegir_opcion()
                    case _:
                        print("Porfavor introduzca una opción válida")
                        elegir = elegir_opcion()
            case 5:
                DEF_MainPedidos.finalizar_programa()
            case _:
                print("Porfavor introduzca una opción válida")
                elegir_opcion()