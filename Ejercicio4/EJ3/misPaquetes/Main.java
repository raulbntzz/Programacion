package misPaquetes;

public class Main {
	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.depositar(500);
		cuenta1.getSaldo();
		cuenta1.retirar(200);
		cuenta1.getSaldo();
		cuenta1.retirar(300);
		cuenta1.getSaldo();
	}
}
