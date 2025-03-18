import misClases.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Raúl Benítez");
        System.out.println("Nombre del usuario: " + usuario.getNombre());
	
        usuario.setNombre("Juanito Pichafloja");
        System.out.println("Nombre del usuario: " + usuario.getNombre());
    }
}