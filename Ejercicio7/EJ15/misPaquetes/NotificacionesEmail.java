package misPaquetes;

public class NotificacionesEmail implements Notificable{
	String direccionCorreo;
	
	public NotificacionesEmail(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}
	
	@Override
	public void enviar(String mensaje) {
		System.out.println("El mensaje se envía a: " + direccionCorreo + " y es el siguiente: " + mensaje);
	}
}
