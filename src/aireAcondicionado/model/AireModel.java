package aireAcondicionado.model;

import java.util.Random;

public class AireModel {
	private Random random;

	public AireModel() {
		random = new Random();
	}

	public double leerTemperatura() {
		return 25 + random.nextDouble() * 10; // Simula temperatura entre 25 y 35°C
	}

	public double leerHumedad() {
		return 50 + random.nextDouble() * 30; // Simula humedad entre 50% y 80%
	}
}

