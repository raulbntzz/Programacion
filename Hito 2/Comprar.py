import ConectarMySQL

def tabla_compras():
    print()
    print("=== Gestión de Compras ===")
    print("Seleccione una opción:")
    print("1- Realizar Compra")
    print("2- Seguimiento De Compra")
    print("3- Volver")

def realizar_compra():
    try:
        conexion = ConectarMySQL.conectar_basedatos()

        idCliente = int(input("Introduce el id del cliente que desea hacer la compra: "))

        cursor = conexion.cursor()
        consulta = '''INSERT INTO Pedidos (id_cliente, fecha) VALUES (%s, NOW())'''
        cursor.execute(consulta, (idCliente,))
        conexion.commit()

        id_pedido = cursor.lastrowid

        productos = []
        while True:
            idProducto = input("Introduce el id del producto que deseas comprar (o 'fin' para finalizar): ")
            if idProducto.lower() == 'fin':
                break   
            idProducto = int(idProducto)

            cantidades = input("¿Cuántos deseas comprar?: ")
            cantidades = int(cantidades)

            precio = input("Introduce el precio del producto: ")
            precio = float(precio)

            precio_total = cantidades * precio
            productos.append((id_pedido, idProducto, cantidades, precio_total))

        consulta_productos = '''INSERT INTO Detalles (id_pedido, id_producto, cantidad, precio) VALUES (%s, %s, %s, %s)'''
        cursor.executemany(consulta_productos, productos)
        conexion.commit()

        return print(f"Pedido creado correctamente, el id de seguimiento es: {id_pedido}")
    except:
        return print("No se ha podido crear el pedido")

def seguimiento_pedido():
    try:
        conexion = ConectarMySQL.conectar_basedatos()
        id_pedido = int(input("Introduce el id pedido para poder localizar tu pedido: "))

        cursor = conexion.cursor()
        consulta = '''SELECT id_producto, cantidad, precio FROM Detalles WHERE id_pedido = %s'''
        cursor.execute(consulta, (id_pedido,))
        resultados = cursor.fetchall()
        if resultados:
            for fila in resultados:
                print(fila)
        else:
            print("No se encontró el pedido.")
    except:
        return print("No se ha podido encontrar el pedido")