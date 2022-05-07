package agencia.miahuas.model;

import java.util.List;

import agencia.miahuas.pojo.Transporte;

public class TransporteModel {

	public List<Transporte> crearTransporte(List<Transporte> lista1, Transporte transporte){
		lista1.add(transporte);
		return lista1;
	}
	
	public void mostrarTransporte(List<Transporte> lista1) {
		System.out.println("--------------------------------------------------------------");
		System.out.println("|  Id       |  Nombre de transporte  |  Número de asiento    |");
		System.out.println("--------------------------------------------------------------");
		for(Transporte transporte: lista1) {
			System.out.println("|   "+transporte.getIdTranspor() +"       |"           +transporte.getNombreTransport() +"                     |"   +transporte.getNumAsiento() +"                 |" );
			System.out.println("--------------------------------------------------------------");
		}
	}
}

