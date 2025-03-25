
package controlLuces.controller;

import controlLuces.model.LucesModel;
import controlLuces.views.LucesViews;

public class LucesController {
	private LucesModel model;
	private LucesViews views;
	private boolean esDeNoche;

	public LucesController() {
		model = new LucesModel();
		views = new LucesViews();
		esDeNoche = true; // Simulamos que es de noche
	}

	public void iniciar() {
		while (true) {
			boolean movimiento = model.detectarMovimiento();
			boolean lucesEncendidas = esDeNoche && movimiento;

			views.mostrarMensaje("Movimiento detectado: " + movimiento + " - Luces: " + (lucesEncendidas ? "ENCENDIDAS" : "APAGADAS"));

			try {
				Thread.sleep(10000); // Simula lectura cada 10 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}