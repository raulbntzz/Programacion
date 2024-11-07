import DEF_Main

def mostrar_menu():
    print()
    print("=== Gestión de Categorías ===")
    print("Seleccione una opción:")
    print("1- Crear una nueva categoría")
    print("2- Leer categorías existentes")
    print("3- Actualizar una categoría")
    print("4- Eliminar una categoría")
    print("5- Salir")

def main(): 
    while True:
        mostrar_menu()
        elegir = int(input("Introduce una opción del menú: "))
        match elegir:
            case 1:
                DEF_Main.crear_categoria()
            case 2:
                DEF_Main.leer_categorias()
            case 3:
                DEF_Main.actualizar_categoria()
            case 4:
                DEF_Main.eliminar_categoria()
            case 5:
                DEF_Main.finalizar_programa()
            case _:
                print("Porfavor introduzca una opción válida")