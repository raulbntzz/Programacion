import DEF_MainCategoria, DEF_MainClientes

def elegir_basedatos():
    print()
    print("=== Gestión de Tablas ===")
    print("Seleccione una opción:")
    print("1- Categorías")
    print("2- Cliente")

def elegir_opcion():
    mostrar_menu()
    elegir = int(input("Introduce una opción del menú: "))
    return elegir

def mostrar_menu():
    print()
    print("=== Gestión de Opciones ===")
    print("Seleccione una opción:")
    print("1- Crear una nueva categoría")
    print("2- Leer categorías existentes")
    print("3- Actualizar una categoría")
    print("4- Eliminar una categoría")
    print("5- Salir")

def main(): 
    elegir_basedatos()
    elegir_base = int(input("Introduce una opción del menú: "))
    mostrar_menu()
    elegir = int(input("Introduce una opción del menú: "))
    while True:
        match elegir_base:
            case 1:
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
            case _:
                print("Porfavor introduzca una opción válida")
                elegir_opcion()