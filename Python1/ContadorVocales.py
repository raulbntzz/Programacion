palabra = input("Introduce tu palabra")
vocales = "aeiouAEIOU"
haydentro = 0

for letra in palabra:
        if letra in vocales:
            haydentro += 1
total = haydentro
print(f"Hay un total de {total} vocales en tu palabra")