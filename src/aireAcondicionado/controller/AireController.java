package aireAcondicionado.controller;

import aireAcondicionado.model.AireModel;
import aireAcondicionado.views.AireViews;

public class AireController {
	private AireModel sensor;
	private AireViews vista;

	public AireController() {
		sensor = new AireModel();
		vista = new AireViews();
	}

	public void iniciar() {
		while (true) {
			double temperatura = sensor.leerTemperatura();
			double humedad = sensor.leerHumedad();
			boolean aireEncendido = (temperatura > 28 && humedad > 60) || temperatura > 30;

			vista.mostrarMensaje("Temperatura: " + String.format("%.2f", temperatura) + "°C - Humedad: " + String.format("%.2f", humedad) + "% - Aire Acondicionado: " + (aireEncendido ? "ENCENDIDO" : "APAGADO"));

			try {
				Thread.sleep(10000); // Simula lectura cada 10 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
