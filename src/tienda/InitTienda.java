/*
Control de Acceso a una Tienda: Un sistema de control de acceso permite la
entrada a una tienda solo si el cliente tiene una membresía válida
(tiene_membresia = True) y la hora actual está dentro del horario de atención
(True), o si el cliente es un empleado (es_empleado = True). Simula el sistema
en un bucle y muestra si se permite el acceso.
 */

package tienda;

import tienda.controller.TiendaController;

public class InitTienda {
	public static void main(String[] args){
		TiendaController tienda = new TiendaController();
		tienda.iniciar();
	}
}
