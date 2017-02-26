package logica.objetos;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	private String nombre;
	private List<Fecha> fechas;
	public Liga(String nombre, List<Fecha> fechas) {
		super();
		this.nombre = nombre;
		this.fechas = new ArrayList<Fecha>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Fecha> getFechas() {
		return fechas;
	}
	public void setFechas(List<Fecha> fechas) {
		this.fechas = fechas;
	}
}
