import DEF_Conectar

def crear_cliente():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idcliente = input("Introduce el idcliente: ")
        cia = input("Introduce el cia del cliente: ")
        contacto = input("Introduce el contacto: ")
        cargo = input("Introduce el cargo: ")
        direccion = input("Introduce la dirección del cliente: ")
        ciudad = input("Introduce la ciudad del cliente: ")
        region = input("Introduce la región del cliente: ")
        cp = input("Introduce el cp del cliente: ")
        pais = input("Introduce el pais del cliente: ")
        tlf = input("Introduce el telefono del cliente: ")
        fax = input("Introduce el fax del cliente: ")
        
        cursor = conexion.cursor()
        consulta = "INSERT INTO cliente VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
        cursor.execute(consulta, (idcliente, cia, contacto, cargo, direccion, ciudad, region, cp, pais, tlf, fax))
        conexion.commit()
        return print("Cliente creado correctamente")
    except:
        return print("No se ha podido crear el cliente")

def leer_cliente():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM cliente"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer los clientes")

def actualizar_cliente():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        cia = input("Introduce el nuevo nombre del cliente: ")
        idcliente = input("Introduce el idcliente: ")
        
        cursor = conexion.cursor()
        consulta = "UPDATE cliente SET cia = %s WHERE idcliente = %s"
        cursor.execute(consulta, (cia, idcliente))
        conexion.commit()
        return print("Cliente actualizado correctamente")
    except:
        return print("No se ha podido actualizar el cliente")
    
def eliminar_cliente():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idcliente = input("Introduce el idcliente que desea eliminar: ")

        cursor = conexion.cursor()
        consulta = "DELETE FROM cliente WHERE idcliente = %s"
        cursor.execute(consulta, (idcliente,))
        conexion.commit()
        return print("Cliente eliminado correctamente")
    except:
        return print("No se ha podido eliminar el cliente")

def finalizar_programa():
    print("Gracias por utilizar el programa")
    return exit()

