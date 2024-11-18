import ConectarMySQL

def menu_inscripciones():
    print()
    print("=== Gestión de Inscripciones ===")
    print("Seleccione una opción:")
    print("1- Crear Inscripción")
    print("2- Leer Inscripciones")
    print("3- Eliminar Inscripción")
    print("4- Volver")

def crear_inscripcion():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        idcliente = input("Introduce el id del cliente que quiere inscribirse: ")
        idactividad = input("Introduce el id de la actividad a la que desea inscribirse: ")

        cursor = conexion.cursor()
        consulta = "INSERT INTO inscripciones (id_cliente, id_actividad) VALUES (%s, %s)"
        cursor.execute(consulta, (idcliente, idactividad))
        conexion.commit()
        return print("Inscripción creada correctamente")
    except:
        return print("No se ha podido crear la inscripción")
    
def leer_inscripcion():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM inscripciones"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer las inscripciones")
    
def eliminar_inscripcion():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        idinscripcion = int(input("Introduce el id de la inscripción que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM inscripciones WHERE id_inscripcion = %s"
        cursor.execute(consulta, (idinscripcion,))
        conexion.commit()
        return print("Inscripción eliminada correctamente")
    except:
        return print("No se ha podido eliminar la inscripción")