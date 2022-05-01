package agencia.miahuas.model;

import java.util.List;

import agencia.miahuas.pojo.Viaje;

public class ViajeModel {

	// lista de viaje
	public List<Viaje> crearViaje(List<Viaje> lis, Viaje viaje) {
		lis.add(viaje);
		return lis;
	}

	public void mostrarViaje(List<Viaje> lis) {
		for (Viaje viaje : lis) {
			System.out.println("Id_código: " + viaje.getCodigo());
			System.out.println("Destino: " + viaje.getDestino());
			System.out.println("La salida es:" + viaje.getSalida());
			System.out.println("El regreso es:" + viaje.getRegreso());
			System.out.println("El precio es:" + viaje.getPrecio());

		}

	}

}
