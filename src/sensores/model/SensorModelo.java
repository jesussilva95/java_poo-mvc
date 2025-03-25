package sensores.model;

import java.util.Random;

public class SensorModelo {

	private Random random;

	public SensorModelo() {
		random = new Random();
	}

	public boolean detectarMovimiento() {
		return random.nextBoolean(); // Simula detección de movimiento aleatoria
	}
}
