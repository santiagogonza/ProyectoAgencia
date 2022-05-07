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
	
	public Destino obtenerUnDestino(List<Destino> lista, String nombre) {
		for (Destino destino : lista) {
			if(destino.getNombre().compareTo(nombre)==0) {
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
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|   Id     |   Destino      	       | Código Postal      |                  Dirección               |    Télefono        |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		for (Destino destino : lista) { 
		System.out.println("|   "+destino.getIdlugar() +"      |   "+ destino.getNombre() +"\t  | "       + destino.getCodigoPost() +"\t       | " + destino.getDireccion() +"    \t|" + destino.getTelefono()+"    |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");	
			
			
			
			
			
		}	
		
	}

}
