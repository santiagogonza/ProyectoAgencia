/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 9 de mayo del 2022				   
 Descripción: En la fuición main esta función principal del progrma y que 
 			  a través ello se puede compilar el programa, 
 */
package agencia.miahuas.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import agencia.miahuas.pojo.Destino;
import agencia.miahuas.pojo.Viaje;
import agencia.miahuas.pojo.Transporte;
import agencia.muahuas.controller.DestinoController;
import agencia.muahuas.controller.ViajeController;
import agencia.muahuas.controller.TransporteController;

public class Principal {

	// se crea la lista de Destino
	private static DestinoController controlDest = new DestinoController();
	private static List<Destino> listaDest = new ArrayList<>();

	// se crea la lista de viaje
	private static ViajeController controlViaj = new ViajeController();
	private static List<Viaje> listaViaj = new ArrayList<>();

	// se crea el arreglo de Transporte
	private static TransporteController controlTransp = new TransporteController();
	private static List<Transporte> listaTransp = new ArrayList<>();

	// Scanner lee un dato por el teclado

	private static Scanner leerNumero = new Scanner(System.in);
	private static Scanner leercadenas = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		// se crea el nuevo objeto de destino
		Destino destino1 = new Destino();
		Destino destino2 = new Destino();
		Destino destino3 = new Destino();
		Destino destino4 = new Destino();
		Destino destino5 = new Destino();
		Destino destino6 = new Destino();

		// se crea el objeto de viaje

		Viaje viaje1 = new Viaje();
		Viaje viaje2 = new Viaje();

		// se crea el nuevo objeto de Transporte

		Transporte transport1 = new Transporte();
		Transporte transport2 = new Transporte();
		Transporte transport3 = new Transporte();

		destino1.setIdlugar(1);
		destino1.setNombre("Santa Cruz Xitla");
		destino1.setCodigoPost(70823);
		destino1.setDireccion("Presidencia municipal de xitla");
		destino1.setTelefono("+52 951 512 0300");

		destino2.setIdlugar(2);
		destino2.setNombre("San Ildefonso Amatlán");
		destino2.setCodigoPost(70828);
		destino2.setDireccion("Presidencia municipal Idelfonso");
		destino2.setTelefono("+52 957 572 0438");

		destino3.setIdlugar(3);
		destino3.setNombre("Monjas");
		destino3.setCodigoPost(70826);
		destino3.setDireccion("El Municipio de Monjas");
		destino3.setTelefono("+52 951 105 3048");

		destino4.setIdlugar(4);
		destino4.setNombre("Santo Tomás Tamazulapan");
		destino4.setCodigoPost(70866);
		destino4.setDireccion("Presidencia municipal de Tama");
		destino4.setTelefono("+52 951 510 5089");

		destino5.setIdlugar(5);
		destino5.setNombre("Santa Catarina Cuixtla");
		destino5.setCodigoPost(70830);
		destino5.setDireccion("Presidencia municipal de Cuixtla");
		destino5.setTelefono("+52 951 533 0052");

		destino6.setIdlugar(6);
		destino6.setNombre("San Andrés Paxtlán");
		destino6.setCodigoPost(70868);
		destino6.setDireccion("Presidencia municipal de San Andrés");
		destino6.setTelefono("+52 951 488 3200");

		controlDest.crearDestino(listaDest, destino1);
		controlDest.crearDestino(listaDest, destino2);
		controlDest.crearDestino(listaDest, destino3);
		controlDest.crearDestino(listaDest, destino4);
		controlDest.crearDestino(listaDest, destino5);
		controlDest.crearDestino(listaDest, destino6);

		// nasa
		viaje1.setCodigo(1);
		viaje1.setDestino("Monjas");
		viaje1.setSalida("a las 5:am");
		viaje1.setRegreso("Cada hora");
		viaje1.setPrecio(75);

		viaje2.setCodigo(2);
		viaje2.setDestino("Santo Tomas Tamazulapan");
		viaje2.setSalida("a las 5:am");
		viaje2.setRegreso("Cada 15 minutos");
		viaje2.setPrecio(50);

		controlViaj.crearViaje(listaViaj, viaje1);
		controlViaj.crearViaje(listaViaj, viaje2);

		// transporte
		transport1.setIdTranspor(1);
		transport1.setNombreTransport("Taxi");
		transport1.setNumAsiento(5);

		transport2.setIdTranspor(2);
		transport2.setNombreTransport("Micro Buss");
		transport2.setNumAsiento(20);

		transport3.setIdTranspor(3);
		transport3.setNombreTransport("Motocicletas");
		transport3.setNumAsiento(2);

		controlTransp.crearTransporte(listaTransp, transport1);
		controlTransp.crearTransporte(listaTransp, transport2);
		controlTransp.crearTransporte(listaTransp, transport3);

		do {
			// menú de opciones
			System.out.println("------------------------------------------");
			System.out.println("| AGENCIA DE VIAJES MIAHUATLÁN           |");
			System.out.println("|  1.- Lista de ecomendación de lugares: |");
			System.out.println("|  2.- Solicictar luagres                |");
			System.out.println("|  3.- Lista de transporte:              |");
			System.out.println("|  4.- Reservación:                      |");
			System.out.println("|  5.- Salir                             |");
			System.out.println("------------------------------------------");

			System.out.println("\n");
			int candato;
			opc = leerNumero.nextInt();

			switch (opc) {
			case 1:
				System.out.println("\t Lista Recomendación de lugares de miahuatlán ");

				controlDest.mostrarDestino(listaDest);

				break;
			case 2:
				System.out.println("haga su solicitud hacia al destino que desea realizar");

				controlViaj.mostrarViaje(listaViaj);
				System.out.println("ingrese la cantidad de viajes que de desea realizar:\n");
				candato = leerNumero.nextInt();
				for (int i = 0; i < candato; i++) {

					Viaje viaje3 = new Viaje();

					viaje3.setCodigo(listaViaj.size() + 1);
					System.out.println("ingresa el nombre del destino que desea realizar");
					viaje3.setDestino(leercadenas.nextLine());

					System.out.println("ingre la hora de salida");
					viaje3.setSalida(leercadenas.nextLine());
					System.out.println("ingrese la hora de regreso");
					viaje3.setRegreso(leercadenas.nextLine());
					viaje3.setPrecio(50);

					controlViaj.crearViaje(listaViaj, viaje3);
				}

				System.out.println("Listas de Viajes");

				controlViaj.mostrarViaje(listaViaj);

				break;

			case 3:
				System.out.println("ingrese la cantidad de transporte que desea agregar:");

				candato = leerNumero.nextInt();
				for (int i = 0; i < candato; i++) {
					Transporte transport4 = new Transporte();
					transport4.setIdTranspor(listaTransp.size() + 1);
					System.out.println("ingrese el nombre de transporte que desea viajar: \n");
					transport4.setNombreTransport(leercadenas.nextLine());
					System.out.println("ingrese el numero de acientos del transporte para realizar su viaje");
					transport4.setNumAsiento(leerNumero.nextInt());

					controlTransp.crearTransporte(listaTransp, transport4);

				}
				System.out.println("\n\tLista de transpotes");

				// mustra la lista transporte
				controlTransp.mostrarTransporte(listaTransp);

				break;

			case 4:
				System.out.println("lista de lugares para que haga su reservación: \n");
				controlDest.mostrarDestino(listaDest);
				Destino destino;
				long id;
				System.out.println("eliga el Id del destino que desea viajar: \n");
				do {
					id = leerNumero.nextLong();
					destino = controlDest.obtenerUnDestino(listaDest, id);
					if (destino == null) {
						System.out.println("No hay registro");
						System.out.println("ingresa una opcion valida");
					}
				} while (destino == null);

				System.out.println(
						"-------------------------------------------------------------------------------------------");
				System.out.println(
						"|               Destino            |       Ubicación                  |    Télefono       |");
				System.out.println(
						"-------------------------------------------------------------------------------------------");

				System.out.printf("| %31s  | %32s | %17s |", destino.getNombre(), destino.getDireccion(),
						destino.getTelefono());
				System.out.println(
						"\n-------------------------------------------------------------------------------------------");
				
				
					System.out.print("\t\n lista de transporte:\n\n ");
			
				
				controlTransp.mostrarTransporte(listaTransp);
				
				System.out.println("Eliga el Id del Transporte:\n");

				do {
					id = leerNumero.nextLong();
					if (id < 1 || id >= listaTransp.size()) {
						System.out.println("ingrese un id valido");

					}
				} while (id < 1 || id >= listaTransp.size());
				Transporte transporte = controlTransp.obtenerTransporte(listaTransp, id);
				System.out.println("--------------------------------------------------------------------");
				System.out.println("| Id Transporte |  Nombre de Transporte  |   Precio del Transporte |");
				System.out.printf("| %12d  | %22s | %23s |", transporte.getIdTranspor(),
						transporte.getNombreTransport(), transporte.getNumAsiento());
				System.out.println("\n--------------------------------------------------------------------");

				
				
				break;
			case 5:

				System.out.println("\t*************  Fin del programa   **************");
				break;

			}

		} while (opc >= 1 && opc < 5);

	}

}
