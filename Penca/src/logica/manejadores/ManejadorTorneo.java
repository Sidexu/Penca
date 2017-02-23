package logica.manejadores;

import java.util.ArrayList;
import java.util.List;

import logica.objetos.Torneo;


public class ManejadorTorneo {
	private List<Torneo> torneos = null;
	private static ManejadorTorneo INSTANCE = null;

    private ManejadorTorneo(){
    	this.torneos = new ArrayList<Torneo>();
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new ManejadorTorneo();
        }
    }

    public static ManejadorTorneo getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
	
	public void agregarTorneo(String nombre){
		Torneo t = new Torneo(nombre);
		torneos.add(t);
	}
	
	public void listarTorneos(){
		for(Torneo t: torneos){
			System.out.println("Torneo: "+t.getNombre());
		}
	}
}
