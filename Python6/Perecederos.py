productos = [
    {"comida": "Zanahoria", "estado": "no perecedero"},
    {"comida": "Arroz", "estado": "perecedero"},
    {"comida": "Manzana", "estado": "no perecedero"},
    {"comida": "Frutos Secos", "estado": "perecedero"},
    {"comida": "Lentejas", "estado": "no perecedero"},
    {"comida": "Plátano", "estado": "perecedero"},
]

def es_aprobado(producto):
    return producto["estado"] == "perecedero"

productos_perecederos = list(filter(es_aprobado, productos))
for producto in productos_perecederos:
    print(producto["comida"])