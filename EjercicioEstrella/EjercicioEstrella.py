import random

def inicio_codigo():
    monstruos_lista = list(monstruos)
    aleatorio = random.randint(0,4)
    monstruo_nombre = monstruos_lista[aleatorio]
    monstruo_dificultad = monstruos[monstruo_nombre]
    return monstruo_nombre, monstruo_dificultad

#Crear listas y variables para guardar la información del juego
intentos = 3
monstruos = {'Vampiro': 3, 'Momia': 2, 'Bruja': 4, 'Esqueleto': 1, 'Fantasma': 5}
objetos = ['estaca', 'poción mágica', 'hechizo']
eleccion_final_monstruo = {}

#Elegir monstruo y dificultad
monstruo_nombre,  monstruo_dificultad = inicio_codigo()
print("¡Bienvenido a la caza de monstruos de Halloween!")
print(f"Un/a {monstruo_nombre} ha aparecido con dificultad {monstruo_dificultad}")

#Almacenar información del monstruo en lista
eleccion_final_monstruo[monstruo_nombre] = monstruo_dificultad
probabilidad_objetos = random.randint(0, 101) #Por número aleatorio 
probabilidad_exito = 100 - (monstruo_dificultad * 16) #Por cálculos: lvl 5 = 5*16 = 80 (por lo que quedaria un 20% de probabilidad)

#Capturar monstruo
while intentos != 0:
    print(f"\nTienes {intentos} intentos restantes")
    #Elegir el objeto para matar al monstruo
    print(f"Elige un objeto para intentar capturar al {monstruo_nombre}: estaca, poción mágica, hechizo")
    elegir_objetos = input("Escribe el nombre del objeto: ")

    #Comprobar si el objeto introducido por el usuario es correcto
    if elegir_objetos not in objetos:
        print(f"El objeto {elegir_objetos} no es válido, prueba de nuevo")
    else:
        #Comprobar quien gana por probabilidades
        if probabilidad_objetos > probabilidad_exito:
            print(f"Has conseguido capturar al {monstruo_nombre} con un/a {elegir_objetos}")
            break
        elif probabilidad_exito > probabilidad_objetos:
            print(f"Has fallado al intentar capturar a {monstruo_nombre} con {elegir_objetos}")
            intentos -= 1
    if intentos == 0:
        print(f"{monstruo_nombre} ha escapado")     