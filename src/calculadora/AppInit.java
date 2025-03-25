
/*
Calculadora simple: Se implementa una calculadora que pide al usuario dos
números y una operación (suma, resta, multiplicación o división). Utiliza
condicionales para determinar la operación a realizar y un bucle para permitir
al usuario realizar múltiples cálculos hasta que decida salir.
 */
package calculadora;

import calculadora.controller.CalculadoraControll;

public class AppInit {
	public static void main(String[] args){
		CalculadoraControll control = new CalculadoraControll();
		control.iniciar();
	}
}
