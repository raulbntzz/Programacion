package misPaquetes;

public class Main {
	public static void main(String[] args) {
		CorreoElectronico correo1 = new CorreoElectronico();
		MensajeTexto mensaje1 = new MensajeTexto();
		
		correo1.enviarNotificacion();
		mensaje1.enviarNotificacion();
	}
}
