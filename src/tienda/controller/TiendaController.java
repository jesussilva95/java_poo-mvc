package tienda.controller;

import temperature.model.TemperatureModel;
import tienda.model.TiendaModel;
import tienda.views.TiendaViews;

import java.util.Scanner;

public class TiendaController {

	private TiendaModel model;
	private TiendaViews vista;
	private Scanner scanner;

	public TiendaController() {
		model = new TiendaModel();
		vista = new TiendaViews();
		scanner = new Scanner(System.in);
	}

	public void iniciar() {
		while (true) {
			System.out.print("¿Tiene membresía? (true/false): ");
			boolean tieneMembresia = scanner.nextBoolean();
			System.out.print("¿Es empleado? (true/false): ");
			boolean esEmpleado = scanner.nextBoolean();
			boolean horario = model.horarioAtencion();

			boolean accesoPermitido = (tieneMembresia && horario) || esEmpleado;

			vista.mostrarMensaje("Horario de atención: " + horario + " - Acceso: " + (accesoPermitido ? "PERMITIDO" : "DENEGADO"));
		}
	}
}
