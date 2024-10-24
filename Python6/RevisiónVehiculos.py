vehiculos = [
    {"modelo": "Bugatti", "estado": "aprobado"},
    {"modelo": "BMW", "estado": "pendiente"},
    {"modelo": "Mercedes", "estado": "aprobado"},
    {"modelo": "Porsche", "estado": "pendiente"},
]

def es_aprobado(vehiculo):
    return vehiculo["estado"] == "aprobado"

vehiculos_aprobados = list(filter(es_aprobado, vehiculos))
print("Los vehiculos con la ITV pasada son: ")
for vehiculo in vehiculos_aprobados:
    print(vehiculo["modelo"])
