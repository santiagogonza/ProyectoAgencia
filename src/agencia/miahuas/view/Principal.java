/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se presentan la función main 
 */
package agencia.miahuas.view;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import agencia.miahuas.pojo.Destino;

import agencia.miahuas.pojo.Viaje;
import agencia.muahuas.controller.DestinoController;
import agencia.muahuas.controller.ViajeController;

public class Principal {

	// se crea la lista de Destino
	private static DestinoController controller = new DestinoController();
	private static List<Destino> lista = new ArrayList<>();

	// viaje
	private static ViajeController control = new ViajeController();
	private static List<Viaje> lis = new ArrayList<>();

	// se crea la lista de viaje

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// se crea el nuevo objeto de destino
		Destino destino1 = new Destino();
		Destino destino2 = new Destino();
		Destino destino3 = new Destino();
		Destino destino4 = new Destino();
		Destino destino5 = new Destino();
		Destino destino6 = new Destino();

		// se crea el objeto de viaje

		Viaje viaje1 = new Viaje();

//menú de opciones 
		System.out.println("1.- lista de lugares: ");
		System.out.println("2.- lista de transporte: ");
		System.out.println("3.- lsita de viajes: ");

		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			System.out.println("la lista de los lugasres son: ");

			destino1.setIdlugar(1);
			destino1.setNombre("zitlá");
			destino1.setDireccion("16 de septiembre");
			destino1.setTelefono("9512364425");

			destino2.setIdlugar(2);
			destino2.setNombre(".....");
			destino2.setDireccion("16 de septiembre");
			destino2.setTelefono("9511882085");

			destino3.setIdlugar(3);
			destino3.setNombre("Monjas");
			destino3.setDireccion("la Z");
			destino3.setTelefono("9511234587");

			destino4.setIdlugar(4);
			destino4.setNombre("Tamazulapa");
			destino4.setDireccion("3 de octubre");
			destino4.setTelefono("9515548655");

			destino5.setIdlugar(5);
			destino5.setNombre("Santa Cruz Cuixtlá");
			destino5.setDireccion("15 de septiembre");
			destino5.setTelefono("9515548655");

			destino6.setIdlugar(6);
			destino6.setNombre("San Jose del Pácifico");
			destino6.setDireccion("Ubicado en la sierra sur");
			destino6.setTelefono("9515548655");

			controller.crearDestino(lista, destino1);
			controller.crearDestino(lista, destino2);
			controller.crearDestino(lista, destino3);
			controller.crearDestino(lista, destino4);
			controller.crearDestino(lista, destino5);
			controller.crearDestino(lista, destino6);
			break;
		case 2:
			System.out.println("Lista de transpotes");

		case 3:

			System.out.println("Listas de Viajes");

			viaje1.setCodigo(8);
			// viaje1.setDestino("monjas");
			// viaje1.setSalida("a las 9");
			// viaje1.setPrecio(75);

			control.crearViaje(lis, viaje1);

			break;

		}

		controller.mostrarDestino(lista);
		control.mostrarViaje(lis);

	}

}
