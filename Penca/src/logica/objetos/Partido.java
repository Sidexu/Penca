package logica.objetos;

import java.util.Calendar;

public class Partido {
	private Calendar fecha;
	private String resultado;
	private Equipo equipo1;
	private Equipo equipo2;
	public Partido(Calendar fecha, String resultado, Equipo equipo1,
			Equipo equipo2) {
		super();
		this.fecha = fecha;
		this.resultado = resultado;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	
	
}
