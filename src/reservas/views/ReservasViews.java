
package reservas.views;

import java.util.Scanner;

public class ReservasViews {
	private Scanner scanner;

	public ReservasViews() {
		scanner = new Scanner(System.in);
	}

	public int pedirNumeroAsiento() {
		System.out.print("Ingrese el número de asiento a reservar: ");
		return scanner.nextInt();
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
