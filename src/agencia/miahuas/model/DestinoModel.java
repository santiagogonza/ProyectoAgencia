/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */
package agencia.miahuas.model;

import java.util.List;
import agencia.miahuas.pojo.Destino;

public class DestinoModel {

	public List<Destino> crearDestino(List<Destino> lista, Destino destino) {
		lista.add(destino);
		return lista;

	}
	//se crea el método obtenerUnDestino que al 
	public Destino obtenerUnDestino(List<Destino> lista, long id) {
		for (Destino destino : lista) {

			if (destino.getIdlugar() == id) {
				return destino;
			}
		}
		return null;
	}

	public List<Destino> eliminarDestino(List<Destino> lista, long idlugar) {
		Destino destino = new Destino();
		destino = lista.get((int) idlugar);
		lista.remove(destino);
		return lista;

	}

	public void mostrarDestino(List<Destino> lista) {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"|   Id     |   Destino      	           | Código Postal      |                  Dirección               |    Télefono        |");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
		for (Destino destino : lista) {
			System.out.printf("| %8d | %28s  | %18s | %39s  |%19s |", destino.getIdlugar(), destino.getNombre(),
					destino.getCodigoPost(), destino.getDireccion(), destino.getTelefono());
			System.out.println(
					"\n--------------------------------------------------------------------------------------------------------------------------------");

		}

	}

}
