/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 26 de abril del 2022
 * fecha de actualización: 9 de mayo 2022
 * Descripción: en esta parte entra las variables del pojo Transporte 
 * en declarando los atributos de la clase
 * 
 *  se 
 * 
 */
package agencia.miahuas.pojo;

public class Transporte {
	private long idTranspor;
	private int numAsiento;
	private String nombreTransport;
   // se crea el constructor vacio
	public Transporte() {

	}
	//se crea el constructor con párametos correspondientes de cada dato y sus tipos de datos
	public Transporte(long idTranspor, int numAsiento, String nombreTransport) {
		this.idTranspor = idTranspor;
		this.numAsiento = numAsiento;
		this.nombreTransport = nombreTransport;
	}
	
	// se declara los métodos set y get de cada atributo de la clase Transporte
	public long getIdTrasnpor() {
		return idTranspor;
	}

	public void setIdTranspor(long idTranspor) {
		this.idTranspor = idTranspor;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public String getNombreTransport() {
		return nombreTransport;
	}

	public void setNombreTransport(String nombreTransport) {
		this.nombreTransport = nombreTransport;
	}

	public long getIdTranspor() {
		return idTranspor;
	}

}
