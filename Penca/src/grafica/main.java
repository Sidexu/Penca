package grafica;

import logica.manejadores.ManejadorTorneo;

public class main {
	
	public static void main(String[] args) {
		ManejadorTorneo mt = ManejadorTorneo.getInstance();
		mt.agregarTorneo("Pepe");
		mt.listarTorneos();
		mt.agregarTorneo("Pedro");
		mt.listarTorneos();
	}

}
