import mysql.connector

def conectar_basedatos():
    try:
        conexion = mysql.connector.connect(
                host="localhost",
                user="root",
                password="curso",
                database="centro_deportivo"
            )
        return conexion
    except:
        print("Error al conectar a la base de datos")
        return None