package misPaquetes;

public class CuentaBancaria {
	private double saldo;
	
	public void depositar(double cantidad) {
		double total = saldo + cantidad;
		System.out.println("Has depositado " + cantidad + "€");
		saldo = total;
	}
	
	public void retirar(double cantidad) {
		double total = saldo - cantidad;
		System.out.println("Has retirado " + cantidad + "€");
		saldo = total;
	}
	
	public void getSaldo() {
		System.out.println("El saldo actual de la cuenta es: " + saldo);
	}
}
