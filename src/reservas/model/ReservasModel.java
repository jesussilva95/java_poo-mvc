
package reservas.model;

public class ReservasModel {

		private boolean[] asientos;

    public ReservasModel(int capacidad){
		 // false indica asiento libre
		asientos = new boolean[capacidad];
	}

		public boolean reservarAsiento(int numAsiento){
		if (numAsiento < 0 || numAsiento >= asientos.length) {
			// Asiento fuera de rango
			return false;
		}
		if (!asientos[numAsiento]) {
			asientos[numAsiento] = true;
			// Reserva exitosa
			return true;
		}
		// Asiento ocupado
		return false;
	}

		public void mostrarAsientos() {
		for (int i = 0; i < asientos.length; i++) {
			System.out.print((asientos[i] ? "[X]" : "[ ]") + " ");
		}
		System.out.println();
	}

		public boolean hayDisponibles () {
		for (boolean asiento : asientos) {
			if (!asiento) return true;
		}
		return false;

	}
	}
