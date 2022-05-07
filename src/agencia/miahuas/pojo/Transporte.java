/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 26 de abril del 2022
 * fecha de actualización:26 de abril del 2022
 * Descripción: en esta parte entra las variables del pojo Transporte 
 * en declarando los atributos de la clase
 * 
 */
package agencia.miahuas.pojo;

public class Transporte {
	private long idTranspor;
	private int numAsiento;
	private String nombreTransport;
	
	public Transporte(){
		
	}
	public Transporte(long idTranspor, int numAsiento, String nombreTransport) {
		this.idTranspor = idTranspor;
		this.numAsiento = numAsiento;
		this.nombreTransport = nombreTransport;
	}
	
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
