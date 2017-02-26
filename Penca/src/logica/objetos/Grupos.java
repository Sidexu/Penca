package logica.objetos;

import java.util.ArrayList;
import java.util.List;

public class Grupos extends Fase {
	private List<Liga> ligas;

	public Grupos(String nombre) {
		super(nombre);
		this.ligas = new ArrayList<Liga>();
	}

	public List<Liga> getLigas() {
		return ligas;
	}

	public void setLigas(List<Liga> ligas) {
		this.ligas = ligas;
	}
	
	
}
