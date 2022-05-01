package agencia.muahuas.controller;

import java.util.List;

import agencia.miahuas.pojo.Viaje;
import agencia.miahuas.model.ViajeModel;

public class ViajeController {
	// la lista de transporte

	private ViajeModel via = new ViajeModel();

	public List<Viaje> crearViaje(List<Viaje> lis, Viaje viaje) {
		return via.crearViaje(lis, viaje);
	}

	public void mostrarViaje(List<Viaje> lis) {
		via.mostrarViaje(lis);
	}

}
