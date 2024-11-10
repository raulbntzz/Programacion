import DEF_Conectar

def crear_categoria():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idcategoria = input("Introduce el idcategoria: ")
        categoria = input("Introduce el nombre de la categoria: ")
        
        cursor = conexion.cursor()
        consulta = "INSERT INTO categoria VALUES (%s, %s)"
        cursor.execute(consulta, (idcategoria, categoria))
        conexion.commit()
        return print("Categoria creada correctamente")
    except:
        return print("No se ha podido crear la categoría")

def leer_categorias():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        cursor = conexion.cursor()
        consulta = "SELECT * FROM categoria"
        cursor.execute(consulta)
        resultados = cursor.fetchall()
        for linea in resultados:
            print(linea)
    except:
        return print("No se han podido leer las categorías")

def actualizar_categoria():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        nuevo_nombre = input("Introduce el nuevo nombre de la categoria: ")
        idcategoria = input("Introduce el idcategoria: ")

        cursor = conexion.cursor()
        consulta = "UPDATE categoria SET categoria = %s WHERE idcategoria = %s"
        cursor.execute(consulta, (nuevo_nombre, idcategoria))
        conexion.commit()
        return print("Categoria actualizada correctamente")
    except:
        return print("No se ha podido actualizar la categoría")
    
def eliminar_categoria():
    try:
        conexion = DEF_Conectar.conectar_basedatos()
        idcategoria = int(input("Introduce el idcategoria que desea eliminar: "))

        cursor = conexion.cursor()
        consulta = "DELETE FROM categoria WHERE idcategoria = %s"
        print(consulta)
        cursor.execute(consulta, (idcategoria,))
        conexion.commit()
        return print("Categoria eliminada correctamente")
    except:
        return print("No se ha podido eliminar la categoría")

def finalizar_programa():
    print("Gracias por utilizar el programa")
    return exit()