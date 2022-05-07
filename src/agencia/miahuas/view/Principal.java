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
import agencia.miahuas.pojo.Guia;
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
		Viaje viaje2 = new Viaje();
		
		
		Guia guia1 = new Guia();

		// se crea el nuevo objeto de Transporte

		Transporte transport1 = new Transporte();
		Transporte transport2 = new Transporte();
		Transporte transport3 = new Transporte();

		// menú de opciones
		System.out.println("----------------------------------");
		System.out.println("| AGENCIA DE VIAJES MIAHUATLÁN \n|");
		System.out.println("|  1.- Lista de lugares:         |");
		System.out.println("|  2.- Lista de viajes:          |");
		System.out.println("|  3.- Lista de transporte:      |");
		System.out.println("|  4.- Salir                     |");
		System.out.println("---------------------------------");

		System.out.println("\n");
		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			System.out.println("\tla lista de los lugasres son: ");

			destino1.setIdlugar(1);
			destino1.setNombre("Santa Cruz Xitla");
			destino1.setCodigoPost(70823);
			destino1.setDireccion("16 de septiembre");
			destino1.setTelefono("+52 951 512 0300");

			destino2.setIdlugar(2);
			destino2.setNombre("San Ildefonso Amatlán");
			destino2.setCodigoPost(70828);
			destino2.setDireccion("16 de septiembre");
			destino2.setTelefono("+52 957 572 0438");

			destino3.setIdlugar(3);
			destino3.setNombre("Monjas");
			destino3.setCodigoPost(70826);
			destino3.setDireccion("la Z");
			destino3.setTelefono("+52 951 105 3048");

			destino4.setIdlugar(4);
			destino4.setNombre("Santo Tomás Tamazulapan");
			destino4.setCodigoPost(70866);
			destino4.setDireccion("3 de octubre");
			destino4.setTelefono("+52 951 510 5089");

			destino5.setIdlugar(5);
			destino5.setNombre("Santa Catarina Cuixtla");
			destino5.setCodigoPost(70830);
			destino5.setDireccion("15 de septiembre");
			destino5.setTelefono("+52 951 533 0052");

			destino6.setIdlugar(6);
			destino6.setNombre("San Andrés Paxtlán");
			destino6.setCodigoPost(70868);
			destino6.setDireccion("Ubicado en la sierra sur");
			destino6.setTelefono("+52 951 488 3200");

			controlDest .crearDestino(listaDest, destino1);
			controlDest .crearDestino(listaDest, destino2);
			controlDest .crearDestino(listaDest, destino3);
			controlDest.crearDestino(listaDest, destino4);
			controlDest.crearDestino(listaDest, destino5);
			controlDest.crearDestino(listaDest, destino6);

			controlDest.mostrarDestino(listaDest);

			break;
		case 2:

			System.out.println("Listas de Viajes");

			viaje1.setCodigo(1);
			Scanner pedirDestino = new Scanner(System.in);
			viaje1.setDestino(controlDest.obtenerUnDestino(listaDest, pedirDestino.nextLine()));
			// llamamos a la clases guia de tipo guia
			//viaje1.setGuia("nombre");
			//viaje1.getGuia(IdUsuario);
			
			
			//viaje1.setRegreso("Cada hora");
			viaje1.setPrecio(75);

			
			viaje2.setCodigo(2);
			//viaje2.setDestino("Santo Tomas Tamazulapan");
			//viaje2.setSalida("a las 5:am");
			//viaje2.setRegreso("Cada 15 minutos");
			viaje2.setPrecio(50);

			controlViaj.crearViaje(listaViaj , viaje1);
			controlViaj.crearViaje(listaViaj , viaje2);

			controlViaj.mostrarViaje(listaViaj );
			break;

		case 3:

			System.out.println("\n\tLista de transpotes");

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

			// mustra la lista transporte
			controlTransp.mostrarTransporte(listaTransp);

			break;
		case 4:
			System.out.println("\t*************Fin del programa**************");
			break;

		}

	}

}
