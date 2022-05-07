/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */
package agencia.muahuas.controller;

import java.util.List;

import agencia.miahuas.pojo.Viaje;
import agencia.miahuas.model.ViajeModel;

public class ViajeController {
	// la lista de viajes

	private ViajeModel via = new ViajeModel();

	public List<Viaje> crearViaje(List<Viaje> lista1, Viaje viaje) {
		return via.crearViaje(lista1, viaje);
	}

	public void mostrarViaje(List<Viaje> lista1) {
		via.mostrarViaje(lista1);
	}

}
