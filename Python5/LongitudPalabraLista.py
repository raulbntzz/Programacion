def contar_letras(palabras):
    return len(palabras)
    
palabras = ["hola", "uno", "dos", "tres", "cuatro"]
letras_en_palabras = list(map(contar_letras, palabras))
print(letras_en_palabras)