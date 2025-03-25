package controlLuces.model;

import java.util.Random;

public class LucesModel {

	private Random random;

	public LucesModel() {
		random = new Random();
	}

	public boolean detectarMovimiento() {
		return random.nextBoolean(); // Simula detección de movimiento aleatoria
	}
}
