package misClases;

public class ContadorInversa {
    int i = 0;
    int numero = 10;

    public void contar() {
	while (numero > i) {
		System.out.println(numero);
		numero = numero - 1;
	}
    }
}
