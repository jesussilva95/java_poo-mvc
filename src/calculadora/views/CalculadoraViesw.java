package calculadora.views;

import java.util.Scanner;

public class CalculadoraViesw {

	private Scanner scanner;

	public CalculadoraViesw() {
		scanner = new Scanner(System.in);
	}

	public double pedirNumero(String mensaje) {
		System.out.print(mensaje);
		return scanner.nextDouble();
	}

	public char pedirOperador() {
		System.out.print("Ingrese la operación (+, -, *, /) o 'q' para salir: ");
		return scanner.next().charAt(0);
	}

	public void mostrarResultado(double resultado) {
		if (Double.isNaN(resultado)) {
			System.out.println("Operación no válida.");
		} else {
			System.out.println("Resultado: " + resultado);
		}
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
