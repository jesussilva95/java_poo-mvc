package calculadora.controller;

import calculadora.model.CalculadoraModel;
import calculadora.views.CalculadoraViesw;

public class CalculadoraControll {

	private CalculadoraModel calculadora;
	private CalculadoraViesw vista;

	public CalculadoraControll() {
		calculadora = new CalculadoraModel();
		vista = new CalculadoraViesw();
	}

	public void iniciar() {
		while (true) {
			char operador = vista.pedirOperador();
			if (operador == 'q') {
				vista.mostrarMensaje("Saliendo de la calculadora...");
				break;
			}

			double num1 = vista.pedirNumero("Ingrese el primer número: ");
			double num2 = vista.pedirNumero("Ingrese el segundo número: ");
			double resultado = calculadora.operar(num1, num2, operador);
			vista.mostrarResultado(resultado);
		}
	}
}
