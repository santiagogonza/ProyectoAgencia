package agencia.muahuas.controller;

import java.util.List;

import agencia.miahuas.pojo.Viaje;

public class ViajeController {

	// la lista de transporte
	
	private Viaje via= new Viaje();	
	
		public List<Viaje> crearViaje(List<Viaje> lis, Viaje viaje){
			return via.crearViaje(lis, viaje);
		}
		
		public void mostrarViaje(List<Viaje> lis) {
			via.mostrarViaje(lis);
		}
		
}
