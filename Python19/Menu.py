import DEF_Actividades, DEF_Clientes, DEF_Entrenadores, DEF_Inscripciones, Elegir

def mostrar_menu():
    print()
    print("=== Gestión de Tablas ===")
    print("Seleccione una opción:")
    print("1- Clientes")
    print("2- Actividades")
    print("3- Entrenadores")
    print("4- Inscripciones")
    print("5- Salir")

def salir():
    print("Gracias por usar el programa")
    return exit()

def main(): 
    while True:
        mostrar_menu()
        elegir = int(input("Introduce una opción del menú: "))
        match elegir:
            case 1:
                while True:
                    DEF_Clientes.menu_clientes()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            DEF_Clientes.crear_cliente()
                        case 2:
                            DEF_Clientes.leer_cliente()
                        case 3:
                            DEF_Clientes.actualizar_cliente()
                        case 4:
                            DEF_Clientes.eliminar_cliente()
                        case 5:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 2:
                while True:
                    DEF_Actividades.menu_actividades()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            DEF_Actividades.crear_actividad()
                        case 2:
                            DEF_Actividades.leer_actividad()
                        case 3:
                            DEF_Actividades.actualizar_actividad()
                        case 4:
                            DEF_Actividades.eliminar_actividad()
                        case 5:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 3:
                while True:
                    DEF_Entrenadores.menu_entrenadores()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            DEF_Entrenadores.crear_entrenador()
                        case 2:
                            DEF_Entrenadores.leer_entrenador()
                        case 3:
                            DEF_Entrenadores.actualizar_entrenador()
                        case 4:
                            DEF_Entrenadores.eliminar_entrenador()
                        case 5:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 4:
                while True:
                    DEF_Inscripciones.menu_inscripciones()
                    elegir_opcion = Elegir.elegir_opcion()
                    match elegir_opcion:
                        case 1:
                            DEF_Inscripciones.crear_inscripcion()
                        case 2:
                            DEF_Inscripciones.leer_inscripcion()
                        case 3:
                            DEF_Inscripciones.eliminar_inscripcion()
                        case 4:
                            break
                        case _:
                            print("Introduce un valor válido")
            case 5:
                salir()
            case _:
                print("Introduce un valor válido")