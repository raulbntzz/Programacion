package misPaquetes;

public class CuentaAhorro extends Cuenta implements Auditable{
	double tasaIntereses;
	
	public CuentaAhorro(String numeroCuenta, double saldo, double tasaIntereses) {
		super(numeroCuenta, saldo);
		this.tasaIntereses = tasaIntereses;
	}
	
	@Override
	public String obtenerDetalles() {
		return "\nEl número de cuenta es: " + numeroCuenta + ". \nSaldo: " + saldo + "€. \nTasa de interés: " + tasaIntereses + "%";
	}
}
