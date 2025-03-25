package temperature.controller;

import temperature.model.TemperatureModel;
import temperature.views.TemperatureViews;

public class TemperatureController {

	private TemperatureModel model;
	private TemperatureViews vista;

	public TemperatureController() {
		model = new TemperatureModel();
		vista = new TemperatureViews();
	}

	public void iniciar() {
		while (true) {
			double temperatura = model.leerTemperatura();
			String estado = model.controlarTemperatura(temperatura);
			vista.mostrarMensaje("Temperatura: " + String.format("%.2f", temperatura) + "°C - " + estado);

			try {
				Thread.sleep(10000); // Espera unos  segundos antes de la siguiente lectura
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
