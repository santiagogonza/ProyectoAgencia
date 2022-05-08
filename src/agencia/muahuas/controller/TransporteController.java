/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */

package agencia.muahuas.controller;

import java.util.List;
import agencia.miahuas.model.TransporteModel;

import agencia.miahuas.pojo.Transporte;

public class TransporteController {

	private TransporteModel transport = new TransporteModel();

	public List<Transporte> crearTransporte(List<Transporte> lista2, Transporte transporte) {
		return transport.crearTransporte(lista2, transporte);
	}

	public void mostrarTransporte(List<Transporte> lista2) {
		transport.mostrarTransporte(lista2);
	}
	

	public Transporte obtenerTransporte(List<Transporte> lista, long id) {
		return transport.obtenerTransporte(lista, id);
	}
	
	
	
}
