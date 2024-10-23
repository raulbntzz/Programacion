def convertir_titulo(palabras):
    return palabras.title()
    
palabras = ["hola profe", "verde lima", "adios adios"]
palabrasconvertidas = list(map(convertir_titulo, palabras))
print(palabrasconvertidas)