package misPaquetes;

public class CuentaCorriente extends Cuenta implements Auditable{
	double limiteSobregiro;
	
	public CuentaCorriente(String numeroCuenta, double saldo, double limiteSobregiro) {
		super(numeroCuenta, saldo);
		this.limiteSobregiro = limiteSobregiro;
	}
	
	@Override
	public String obtenerDetalles() {
		return "\nEl número de cuenta es: " + numeroCuenta + ". \nSaldo: " + saldo + "€. \nLímite de sobregiro: " + limiteSobregiro + "€";
	}
}
