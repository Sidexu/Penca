package logica.objetos;

public class Eliminatoria extends Fase {
	private Integer cantidadEquipos;
	private Boolean conIdaYVuelta;
	
	public Eliminatoria(String nombre, Integer cantidadEquipos, Boolean conIdaYVuelta) {
		super(nombre);
		this.cantidadEquipos = cantidadEquipos;
		this.conIdaYVuelta = conIdaYVuelta;
	}
	public Integer getCantidadEquipos() {
		return cantidadEquipos;
	}
	public void setCantidadEquipos(Integer cantidadEquipos) {
		this.cantidadEquipos = cantidadEquipos;
	}
	public Boolean getConIdaYVuelta() {
		return conIdaYVuelta;
	}
	public void setConIdaYVuelta(Boolean conIdaYVuelta) {
		this.conIdaYVuelta = conIdaYVuelta;
	}
}
