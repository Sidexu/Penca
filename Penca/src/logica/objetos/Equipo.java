package logica.objetos;

public class Equipo {
	private String nombre;
	private String imagen;
	public Equipo(String nombre, String imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
