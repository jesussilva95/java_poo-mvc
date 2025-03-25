package temperature.model;

import java.util.Random;

public class TemperatureModel {

	private Random random;

	public TemperatureModel() {
		random = new Random();
	}

	public double leerTemperatura() {
		return 5 + random.nextDouble() * 30; // Simula una temperatura entre 5 y 35°C
	}

	public String controlarTemperatura(double temperatura) {
		if (temperatura < 10) {
			return "Calefactor activado";
		} else if (temperatura > 25) {
			return "Ventilador activado";
		} else {
			return "Sistema inactivo";
		}
	}
}
