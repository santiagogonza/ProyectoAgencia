package agencia.miahuas.model;

import java.util.List;

//import agencia.miahuas.pojo.Destino;
import agencia.miahuas.pojo.Transporte;

public class TransporteModel {

	public List<Transporte> crearTransporte(List<Transporte> lista1, Transporte transporte) {
		lista1.add(transporte);
		return lista1;
	}

	public Transporte obtenerTransporte(List<Transporte> lista, long id) {
		for (Transporte transporte : lista) {

			if (transporte.getIdTranspor() == id) {
				return transporte;
			}
		}
		return null;
	}

	public void mostrarTransporte(List<Transporte> lista1) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("|  Id       |  Nombre de transporte  |  Número de asiento    |");
		System.out.println("--------------------------------------------------------------");
		for (Transporte transporte : lista1) {
			System.out.printf("| %9d | %21s  | %21d |",transporte.getIdTranspor(),transporte.getNombreTransport(), transporte.getNumAsiento() );
			System.out.println("\n--------------------------------------------------------------");
		}
	}
}
