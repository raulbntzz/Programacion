import ConectarMySQL

def menu_clientes():
    print()
    print("=== Gestión de Clientes ===")
    print("Seleccione una opción:")
    print("1- Crear Cliente")
    print("2- Leer Clientes")
    print("3- Actualizar Clientes")
    print("4- Eliminar Cliente")
    print("5- Volver")

def crear_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        nombre = input("Introduce el nombre del cliente: ")
        edad = int(input("Introduce la edad del cliente: "))
        tipo_membresia = input("Introduce el tipo de miembresia del cliente: ")

        cursor = conexion.cursor()
        consulta = "INSERT INTO clientes (nombre, edad, tipo_membresia) VALUES (%s, %s, %s)"
        cursor.execute(consulta, (nombre, edad, tipo_membresia))
        conexion.commit()
        return print("Cliente creado correctamente")
    except:
        return print("No se ha podido crear el cliente")
    
def leer_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM clientes"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer los clientes")
    
def actualizar_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        idcliente = input("Introduce el id del cliente: ")
        nueva_membresia = input("Introduce la nueva membresia del cliente: ")
        nuevo_nombre = input("Introduce el nuevo nombre del cliente: ")
        edad = int(input("Introduce la nueva edad del cliente: "))

        cursor = conexion.cursor()
        consulta = "UPDATE clientes SET tipo_membresia = %s WHERE id_cliente = %s"
        cursor.execute(consulta, (nueva_membresia, idcliente))
        conexion.commit()

        cursor = conexion.cursor()
        consulta = "UPDATE clientes SET nombre = %s WHERE id_cliente = %s"
        cursor.execute(consulta, (nuevo_nombre, idcliente))
        conexion.commit()

        cursor = conexion.cursor()
        consulta = "UPDATE clientes SET edad = %s WHERE id_cliente = %s"
        cursor.execute(consulta, (edad, idcliente))
        conexion.commit()
        return print("Cliente actualizado correctamente")
    except:
        return print("No se ha podido actualizar el cliente")
    
def eliminar_cliente():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        idcliente = int(input("Introduce el id del cliente que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM clientes WHERE id_cliente = %s"
        cursor.execute(consulta, (idcliente,))
        conexion.commit()
        return print("Cliente eliminado correctamente")
    except:
        return print("No se ha podido eliminar el cliente")