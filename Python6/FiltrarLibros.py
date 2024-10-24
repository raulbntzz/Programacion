libros = [
    {"nombre": "Cien años de soledad", "tipo": "novela"},
    {"nombre": "El gran Gatsby", "tipo": "poesía"},
    {"nombre": "1984", "tipo": "ensayo"},
    {"nombre": "Orgullo y prejuicio", "tipo": "tragicomedia"},
]

def es_tipo(libro):
    return libro["tipo"] == "novela"

libros_tipo = list(filter(es_tipo, libros))
for libro in libros_tipo:
    print(libro["nombre"])
