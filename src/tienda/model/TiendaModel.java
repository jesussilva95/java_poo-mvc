package tienda.model;

import java.util.Random;

public class TiendaModel {

	private Random random;

	public TiendaModel() {
		random = new Random();
	}

	public boolean horarioAtencion() {
		return random.nextBoolean(); // Simula si la tienda está en horario de atención
	}
}
