package sensores.controller;

import sensores.model.SensorModelo;
import sensores.views.SensorViews;

public class SensorController {

	private SensorModelo sensor1, sensor2, sensor3;
	private SensorViews vista;
	private boolean sistemaActivo;
	private boolean esDeNoche;

	public SensorController() {
		sensor1 = new SensorModelo();
		sensor2 = new SensorModelo();
		sensor3 = new SensorModelo();
		vista = new SensorViews();
		sistemaActivo = false;
		// Simulamos que es de noche
		esDeNoche = true;
	}

	public void iniciar() {
		while (true) {
			int opcion = vista.mostrarMenu();
			switch (opcion) {
				case 1:
					sistemaActivo = true;
					vista.mostrarMensaje("Sistema de seguridad activado.");
					monitorear();
					break;
				case 2:
					sistemaActivo = false;
					vista.mostrarMensaje("Sistema de seguridad desactivado.");
					break;
				case 3:
					vista.mostrarMensaje("Saliendo...");
					return;
				default:
					vista.mostrarMensaje("Opción no válida.");
			}
		}
	}

	public void monitorear() {
		while (sistemaActivo) {
			boolean mov1 = sensor1.detectarMovimiento();
			boolean mov2 = sensor2.detectarMovimiento();
			boolean mov3 = sensor3.detectarMovimiento();

			int movimientosDetectados = (mov1 ? 1 : 0) + (mov2 ? 1 : 0) + (mov3 ? 1 : 0);
			boolean alarmaActivada = sistemaActivo && esDeNoche && movimientosDetectados >= 2;

			vista.mostrarMensaje("Sensores: [" + mov1 + ", " + mov2 + ", " + mov3 + "] - Alarma: " + (alarmaActivada ? "ACTIVADA" : "Desactivada"));

			try {
				Thread.sleep(3000); // Simula lectura cada 3 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
