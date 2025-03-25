/*

Juego FizzBuzz: Se desarrolla un programa que recorre los números del 1 al
100. Para cada número, si es divisible por 3, imprime "Fizz"; si es divisible por
5, imprime "Buzz"; y si es divisible por ambos, imprime "FizzBuzz". Si no cumple
ninguna condición, simplemente imprime el número.
 */
package fizz_buzz;

import fizz_buzz.controller.Controlador;

public class AppInit {
	public static void main(String[] args){
		Controlador inicio = new Controlador();
		inicio.iniciar();
	}
}
