notas = {}
contador = 0
suma = 0
asignatura = input("Qué asignatura es?: ")
nota = int(input("Qué nota has sacado?: "))

while asignatura != "fin":
    notas[asignatura] = nota
    asignatura = input("Qué asignatura es?: ")
    contador += 1
    suma = suma + nota
    if asignatura != "fin":
        nota = int(input("Qué nota has sacado?: "))

print(notas)
print("Resumen de las calificaciones: ")
for asignatura, nota in notas.items():
    print(f"{asignatura}: {nota}")
total = suma / contador
print(f"La media total es de: {total}")
