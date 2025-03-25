/*
Control de Aire Acondicionado: Un sistema de aire acondicionado se activa si
la temperatura es mayor a 28°C y la humedad es mayor al 60%, o si la
temperatura es mayor a 30°C independientemente de la humedad. Simula la
lectura de los sensores en un bucle y muestra si el aire acondicionado está
encendido o apagado.
 */

package aireAcondicionado;

import aireAcondicionado.controller.AireController;

public class AppAire {
	public static void main(String[] args){
		AireController aireAcondicionado = new AireController();
		aireAcondicionado.iniciar();
	}
}
