package sensores.views;

import java.util.Scanner;

public class SensorViews {
	private Scanner scanner;

	public SensorViews() {
		scanner = new Scanner(System.in);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public int mostrarMenu() {
		System.out.println("\n1. Activar sistema de seguridad");
		System.out.println("2. Desactivar sistema de seguridad");
		System.out.println("3. Salir");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}
}
