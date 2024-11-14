import mysql.connector

def conectar_basedatos():
    conexion = mysql.connector.connect(
            host="localhost",
            user="root",
            password="curso",
            database="supermercado"
        )
    return conexion