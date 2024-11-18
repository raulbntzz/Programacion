import ConectarMySQL

def menu_entrenadores():
    print()
    print("=== Gestión de Entrenadores ===")
    print("Seleccione una opción:")
    print("1- Crear Entrenador")
    print("2- Leer Entrenadores")
    print("3- Actualizar Entrenadores")
    print("4- Eliminar Entrenador")
    print("5- Volver")

def crear_entrenador():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        nombre_entrenador = input("Introduce el nombre del entrenador: ")
        especialidad = input("Introduce la especialidad del entrenador: ")

        cursor = conexion.cursor()
        consulta = "INSERT INTO entrenadores (nombre_entrenador, especialidad) VALUES (%s, %s)"
        cursor.execute(consulta, (nombre_entrenador, especialidad))
        conexion.commit()
        return print("Entrenador creado correctamente")
    except:
        return print("No se ha podido crear el entrenador")
    
def leer_entrenador():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM entrenadores"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer los entrenadores")
    
def actualizar_entrenador():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        identrenador = input("Introduce el id del entrenador: ")
        nuevo_nombre = input("Introduce el nuevo nombre del entrenador: ")
        nueva_especialidad = input("Introduce la nueva especialidad del entrenador: ")

        cursor = conexion.cursor()
        consulta = "UPDATE entrenadores SET nombre_entrenador = %s WHERE id_entrenador = %s"
        cursor.execute(consulta, (nuevo_nombre, identrenador))
        conexion.commit()

        cursor = conexion.cursor()
        consulta = "UPDATE entrenadores SET especialidad = %s WHERE id_entrenador = %s"
        cursor.execute(consulta, (nueva_especialidad, identrenador))
        conexion.commit()
        return print("Entrenador actualizado correctamente")
    except:
        return print("No se ha podido actualizar el entrenador")
    
def eliminar_entrenador():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        identrenador = int(input("Introduce el id del entrenador que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM entrenadores WHERE id_entrenador = %s"
        cursor.execute(consulta, (identrenador,))
        conexion.commit()
        return print("Entrenador eliminado correctamente")
    except:
        return print("No se ha podido eliminar el entrenador")