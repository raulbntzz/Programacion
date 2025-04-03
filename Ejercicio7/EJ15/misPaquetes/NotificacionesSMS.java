package misPaquetes;

public class NotificacionesSMS implements Notificable{
	int numeroTelefono;
	
	public NotificacionesSMS(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	@Override
	public void enviar(String mensaje) {
		System.out.println("El mensaje se envía a: " + numeroTelefono + " y es el siguiente: " + mensaje);
	}
}
