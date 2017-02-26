package logica.objetos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private List<Equipo> equipos;
	private List<Torneo> torneos;
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
		this.equipos = new ArrayList<Equipo>();
		this.torneos = new ArrayList<Torneo>();
	}
	
	public Pais(String nombre, List<Equipo> equipos, List<Torneo> torneos) {
		super();
		this.nombre = nombre;
		this.equipos = equipos;
		this.torneos = torneos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	public List<Torneo> getTorneos() {
		return torneos;
	}
	public void setTorneos(List<Torneo> torneos) {
		this.torneos = torneos;
	}
	
	
	
}
