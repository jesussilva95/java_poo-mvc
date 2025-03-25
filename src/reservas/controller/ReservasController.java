
package reservas.controller;

import reservas.model.ReservasModel;
import reservas.views.ReservasViews;

public class ReservasController {
	private ReservasModel sala;
	private ReservasViews vista;

	public ReservasController(int capacidad) {
		sala = new ReservasModel(capacidad);
		vista = new ReservasViews();
	}

	public void iniciar() {
		while (sala.hayDisponibles()) {
			sala.mostrarAsientos();
			int numAsiento = vista.pedirNumeroAsiento();
			if (sala.reservarAsiento(numAsiento)) {
				vista.mostrarMensaje("Asiento reservado exitosamente.");
			} else {
				vista.mostrarMensaje("No se pudo reservar el asiento. Puede estar ocupado o fuera de rango.");
			}
		}
		vista.mostrarMensaje("Sala llena. No hay más asientos disponibles.");
	}


}
