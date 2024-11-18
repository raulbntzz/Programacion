import ConectarMySQL

def menu_actividades():
    print()
    print("=== Gestión de Actividades ===")
    print("Seleccione una opción:")
    print("1- Crear Actividad")
    print("2- Leer Actividades")
    print("3- Actualizar Actividades")
    print("4- Eliminar Actividad")
    print("5- Volver")

def crear_actividad():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        nombre_actividad = input("Introduce el nombre de la actividad: ")
        horario = input("Introduce el horario de la actividad: ")
        duracion = int(input("Introduce la duración de la actividad (mins): "))
        id_entrenador = int(input("Introduce el id del entrenador de la actividad: "))

        cursor = conexion.cursor()
        consulta = "INSERT INTO actividades (nombre_actividad, horario, duracion, id_entrenador) VALUES (%s, %s, %s, %s)"
        cursor.execute(consulta, (nombre_actividad, horario, duracion, id_entrenador))
        conexion.commit()
        return print("Actividad creada correctamente")
    except:
        return print("No se ha podido crear la actividad")
    
def leer_actividad():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM actividades"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer las actividades")
    
def actualizar_actividad():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        id_actividad = input("Introduce el id de la actividad: ")
        id_entrenador = input("Introduce el id del nuevo instructor de la actividad: ")
        nombre_actividad = input("Introduce el nuevo nombre de la actividad: ")
        horario = input("Introduce el nuevo horario de la actividad: ")
        duracion = input("Introduce la nueva duracion de la actividad (mins): ")

        cursor = conexion.cursor()
        consulta = "UPDATE actividades SET id_entrenador = %s, nombre_actividad = %s, horario = %s, duracion = %s WHERE id_actividad = %s"
        cursor.execute(consulta, (id_entrenador, nombre_actividad, horario, duracion, id_actividad))
        conexion.commit()
        return print("Actividad actualizada correctamente")
    except:
        return print("No se ha podido actualizar la actividad")
    
def eliminar_actividad():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        id_actividad = int(input("Introduce el id de la actividad que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM actividades WHERE id_actividad = %s"
        cursor.execute(consulta, (id_actividad,))
        conexion.commit()
        return print("Actividad eliminada correctamente")
    except:
        return print("No se ha podido eliminar la actividad")