/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */
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
		for (Viaje viaje: lis) {
			System.out.println("***************************************************");
			System.out.println("\nId_código: " + viaje.getCodigo());
			System.out.println("Destino: " + viaje.getDestino());
			System.out.println("La salida es:" + viaje.getSalida());
			System.out.println("El regreso es:" + viaje.getRegreso());
			System.out.println("El precio es:" + viaje.getPrecio());
			System.out.println("****************************************************");
		}

	}

}
