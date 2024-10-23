numero1 = int(input("Primer numero"))
numero2 = int(input("Segundo numero"))
operacion = input("¿Qué operación quieres realizar? (+, -, * o /)")

match operacion:
    case "+":
        total = numero1 + numero2 
    case "-":
        total = numero1 - numero2
    case "*":
        total = numero1 * numero2
    case "/":
        if numero2 == 0:
            total = "Operación no se puede realizar. División por 0"
        else:
            total = numero1 / numero2
    case _:
        total = "Operación no soportada"

print(f"Resultado:  {total}")