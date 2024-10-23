'''texto = str(input("Introduce tu palabra: "))
palabras = texto.split()

for palabra in palabras:
    print(palabra[::-1], end = ' ')'''

palabra = ""
palabra = str(input("Introduce una palabra: "))
reves = ""
for i in palabra:
    reves = i + reves
print(reves)