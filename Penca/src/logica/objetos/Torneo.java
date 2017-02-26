package logica.objetos;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	private String nombre;
	private List<Fase> fases;
	
	public Torneo(String nombre) {
		super();
		this.nombre = nombre;
		this.fases = new ArrayList<Fase>();
	}
	
	public Torneo(String nombre, List<Fase> fases) {
		super();
		this.nombre = nombre;
		this.fases = fases;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	
	
}
