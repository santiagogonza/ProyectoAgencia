/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */
package agencia.muahuas.controller;

import java.util.List;

// hacemos la llamada a las demas paquetes como el model, pojo.

import agencia.miahuas.model.DestinoModel;
import agencia.miahuas.pojo.Destino;

public class DestinoController {

	private DestinoModel model = new DestinoModel();

	public List<Destino> crearDestino(List<Destino> lista, Destino destino) {
		return model.crearDestino(lista, destino);
	}

	public List<Destino> eliminarDestino(List<Destino> lista, long idlugar) {
		return model.eliminarDestino(lista, idlugar);
	}

	public void mostrarDestino(List<Destino> lista) {
		model.mostrarDestino(lista);
	}
	
	public Destino obtenerUnDestino(List<Destino> lista, String nombre) {
		return model.obtenerUnDestino(lista, nombre);
	}

}
