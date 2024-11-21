import ConectarMySQL

def tabla_cliente():
    print()
    print("=== Gestión de Clientes ===")
    print("Seleccione una opción:")
    print("1- Registrar")
    print("2- Leer Clientes Existentes")
    print("3- Volver")

def crear_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        nombre = input("Introduce tu nombre: ")
        apellido = input("Introduce tu apellido: ")
        email  = input("Introduce tu e-mail: ")
        telefono = input("Introduce tu teléfono: ")
        direccion = input("Introduce tu dirección: ")

        cursor = conexion.cursor()
        consulta = '''INSERT INTO Clientes (nombre, apellido, email, telefono, direccion) VALUES (%s, %s, %s, %s, %s)'''
        cursor.execute(consulta, (nombre, apellido, email, telefono, direccion))
        conexion.commit()
        return print("Cliente creado correctamente")
    except:
        return print("No se ha podido crear el cliente")
    
def leer_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM Clientes"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer los clientes")