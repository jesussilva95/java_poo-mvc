package fizz_buzz.controller;

import fizz_buzz.model.Model;
import fizz_buzz.views.Vista;

public class Controlador {

	private Model juego;
	private Vista vista;

	public Controlador() {
		juego = new Model();
		vista = new Vista();
	}

	public void iniciar() {
		for (int i = 1; i <= 100; i++) {
			String resultado = juego.obtenerResultado(i);
			vista.mostrarMensaje(resultado);
		}
	}
}
