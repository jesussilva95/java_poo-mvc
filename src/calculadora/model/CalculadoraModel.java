
package calculadora.model;

public class CalculadoraModel {

	public double operar(double num1, double num2, char operador) {
		switch (operador) {
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '*': return num1 * num2;
			// Evitar división por cero
			case '/': return (num2 != 0) ? num1 / num2 : Double.NaN;
			// Operador no válido
			default: return Double.NaN;
		}
	}
}
