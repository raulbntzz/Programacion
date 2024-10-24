tareas_hogar = [
    {"Tarea": "Lavar los platos", "tipo": "urgente"},
    {"Tarea": "Limpiar el polvo", "tipo": "urgente"},
    {"Tarea": "Organizar el armario", "tipo": "con tiempo"},
    {"Tarea": "Hacer la colada", "tipo": "urgente"},
    {"Tarea": "Barrido y fregado del suelo", "tipo": "con tiempo"},
    {"Tarea": "Regar las plantas", "tipo": "urgente"},
]

def es_urgente(urgente):
    return urgente["tipo"] == "urgente"

tareas_urgentes = list(filter(es_urgente, tareas_hogar))
for urgente in tareas_urgentes:
    print(urgente["Tarea"])