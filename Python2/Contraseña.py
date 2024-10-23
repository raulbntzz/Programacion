contrasena = "python123"
incontrasena = input("Introduzca una contraseña: ")

while incontrasena != contrasena:
    print("Contraseña incorrecta")
    incontrasena = input("Pruebe de nuevo: ")

print("Contraseña correcta, bienvenido")