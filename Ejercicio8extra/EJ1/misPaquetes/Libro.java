package misPaquetes;

import java.io.*;

public class Libro implements Serializable{
	private static final long serialVersionUID = 1L;
	String titulo;
	String autor;
	String ISBN;
	int anoPublicacion;
	
	public Libro (String titulo, String autor, String ISBN, int anoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.anoPublicacion = anoPublicacion;
	}
	
	public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public String mostrar() {
        return "\nTítulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + ISBN + "\nAño: " + anoPublicacion;
    }
}
