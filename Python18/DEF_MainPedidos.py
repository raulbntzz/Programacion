import DEF_Conectar

def crear_pedido():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idpedido = input("Introduce el id del pedido: ")
        idcliente = input("Introduce el id del cliente que desea realizar la compra: ")
        fechapedido = input("Introduce la fecha del pedido: ")
        fechaentrega = input("Introduce la fecha de entrega del pedido: ")
        
        cursor = conexion.cursor()
        consulta = "INSERT INTO pedido VALUES (%s, %s, %s, %s)"
        cursor.execute(consulta, (idpedido, idcliente, fechapedido, fechaentrega))
    
        idproducto = input("Introduce el id del producto que deseas: ")
        precio = input("Introduce el precio del producto: ")
        cantidades = input("Introduce las cantidades del pedido: ")
        descuento = input("Introduce el descuento a realizar: ")
        
        cursor = conexion.cursor()
        consulta = "INSERT INTO detalle VALUES (%s, %s, %s, %s, %s)"
        cursor.execute(consulta, (idpedido, idproducto, precio, cantidades, descuento))
        conexion.commit()
        return print("Pedido creado correctamente")
    except DEF_Conectar.mysql.connector.Error as e:
        return print(e)

def leer_pedido():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idpedido = input("Introduce el id del cliente que ha realizado el pedido: ")
        cursor = conexion.cursor()
        consulta = "SELECT pedido.idpedido, detalle.idproducto, pedido.idcliente, pedido.fechapedido, pedido.fechaentrega, detalle.precio, detalle.unidades, detalle.descuento FROM pedido INNER JOIN detalle ON pedido.idpedido = detalle.idpedido WHERE pedido.idcliente = %s"
        cursor.execute(consulta, (idpedido,))
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se ha podido leer el pedido")

def actualizar_pedido():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idpedido = input("Introduce id del pedido que desea cambiar: ")
        unidades = input("Introduce la nueva cantidad que desea: ")
        
        cursor = conexion.cursor()
        consulta = "UPDATE pedido SET unidades = %s WHERE idpedido = %s"
        cursor.execute(consulta, (unidades, idpedido))
        conexion.commit()
        return print("Pedido actualizado correctamente")
    except:
        return print("No se ha podido actualizar el pedido")
    
def eliminar_pedido():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idpedido = input("Introduce el id del pedido que desea eliminar: ")

        cursor = conexion.cursor()
        consulta = "DELETE FROM detalle WHERE idpedido = %s"
        cursor.execute(consulta, (idpedido,))
        conexion.commit()

        cursor = conexion.cursor()
        consulta = "DELETE FROM pedido WHERE idpedido = %s"
        cursor.execute(consulta, (idpedido,))
        conexion.commit()
        return print("Pedido eliminado correctamente")
    except:
        return print("No se ha podido eliminar el cliente")

def finalizar_programa():
    print("Gracias por utilizar el programa")
    return exit()

