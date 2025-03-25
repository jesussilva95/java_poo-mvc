
/*
Sistema de reservas: Un sistema donde los usuarios pueden reservar asientos
en una sala (por ejemplo, cine). Usa condicionales para validar si hay asientos
disponibles y bucles para permitir múltiples reservas hasta completar la
capacidad.
 */
package reservas;

import reservas.controller.ReservasController;

public class AppInit {
	public static void main(String [] args){
		ReservasController init = new ReservasController(10);
		init.iniciar();

	}
}

