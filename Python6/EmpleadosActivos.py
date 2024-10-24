empleados = [
    {"nombre": "Alberto", "estado": "activo"},
    {"nombre": "Manuel", "estado": "activo"},
    {"nombre": "Pedro", "estado": "activo"},
    {"nombre": "Pablo", "estado": "inactivo"},
]

def activo(empleado):
    return empleado["estado"] == "activo"

empleados_activos = list(filter(activo, empleados))
print("Los empleados activos son: ")
for empleado in empleados_activos:
    print(empleado["nombre"])
