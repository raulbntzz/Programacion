package misPaquetes;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Notificable> mensajes = new LinkedList<>();
		mensajes.add(new NotificacionesEmail("raul.benitezmulas24@campusfp.es"));
		mensajes.add(new NotificacionesEmail("daniel.gonzalezurena@campusfp.es"));
		mensajes.add(new NotificacionesSMS(655619710));
		mensajes.add(new NotificacionesSMS(666666666));
		
		for (Notificable mensaje : mensajes) {
			((Notificable)mensaje).enviar("Hola me llamo raúl, como estás?");
		}
	}
}
