import DEF_Conectar

def crear_producto():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idproducto = input("Introduce el idproducto: ")
        nombre = input("Introduce el nombre del producto: ")
        idcategoria = input("Introduce el idcategoria: ")
        medida = input("Introduce las cantidades del producto: ")
        precio = input("Introduce el precio del producto: ")
        stock = input("Introduce el stock del producto: ")
        
        cursor = conexion.cursor()
        consulta = "INSERT INTO producto VALUES (%s, %s, %s, %s, %s, %s)"
        cursor.execute(consulta, (idproducto, nombre, idcategoria, medida, precio, stock))
        conexion.commit()
        return print("Producto creado correctamente")
    except:
        return print("No se ha podido crear el prodcuto")

def leer_producto():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM producto"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer los productos")

def actualizar_producto():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        nuevo_nombre = input("Introduce el nuevo nombre del producto: ")
        idproducto = input("Introduce el idproducto: ")
        
        cursor = conexion.cursor()
        consulta = "UPDATE producto SET nombre = %s WHERE idproducto = %s"
        cursor.execute(consulta, (nuevo_nombre, idproducto))
        conexion.commit()
        return print("Producto actualizado correctamente")
    except:
        return print("No se ha podido actualizar el producto")
    
def eliminar_producto():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idproducto = int(input("Introduce el idproducto que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM producto WHERE idproducto = %s"
        cursor.execute(consulta, (idproducto,))
        conexion.commit()
        return print("Producto eliminado correctamente")
    except:
        return print("No se ha podido eliminar el producto")

def finalizar_programa():
    print("Gracias por utilizar el programa")
    return exit()

