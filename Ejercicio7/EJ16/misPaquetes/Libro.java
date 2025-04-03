package misPaquetes;

public class Libro extends Item implements Describible{
	String titulo;
	
	public Libro(int id, String titulo) {
		super(id);
		this.titulo = titulo;
	}
	
	@Override
	public String describir() {
		return "El libro se titula: " + titulo + " y su id es el nº: " + id;
	}
}
