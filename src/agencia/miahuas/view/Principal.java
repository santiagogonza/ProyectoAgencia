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
		Viaje viaje2 = new Viaje();
//menú de opciones 
		System.out.println("1.- Lista de lugares: ");
		System.out.println("2.- Lista de transporte: ");
		System.out.println("3.- Lista de viajes: ");

		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			System.out.println("la lista de los lugasres son: ");

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

			controller.crearDestino(lista, destino1);
			controller.crearDestino(lista, destino2);
			controller.crearDestino(lista, destino3);
			controller.crearDestino(lista, destino4);
			controller.crearDestino(lista, destino5);
			controller.crearDestino(lista, destino6);
			break;
		case 2:
			System.out.println("******************************");
			System.out.println("Lista de transpotes");

		case 3:

			System.out.println("Listas de Viajes");

			viaje1.setCodigo(1);
			viaje1.setDestino("monjas");
			viaje1.setSalida("a las 9");
			viaje1.setRegreso("Cada hora");
			viaje1.setPrecio(75);
			
			viaje2.setCodigo(2);
			viaje2.setDestino("Tamazulapan");
			viaje2.setSalida("a las 5:am");
			viaje2.setRegreso("Cada 25 minutos");
			viaje2.setPrecio(50);

			control.crearViaje(lis, viaje1);
			control.crearViaje(lis, viaje2);
			break;

		}

		controller.mostrarDestino(lista);
		control.mostrarViaje(lis);

	}

}
