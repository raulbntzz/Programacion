def contar_vocales(letras):
    #Empezar contador en 0
    contador = 0
    #Nombrar vocales existentes
    vocales = "aeiouAEIOU"
    for letra in letras:
        if letra in vocales:
            contador += 1
    return contador

print(contar_vocales("Hola Mundo"))