package logica.objetos;

import java.util.ArrayList;
import java.util.List;

public class Fecha {
	private String nombre;
	private List<Partido> partidos;
	public Fecha(String nombre, List<Partido> partidos) {
		super();
		this.nombre = nombre;
		this.partidos = new ArrayList<Partido>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
}
