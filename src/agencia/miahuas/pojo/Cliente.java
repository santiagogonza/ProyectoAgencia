/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 26 de abril del 2022
 * fecha de actualización:26 de abril del 2022
 * Descripción: en esta parte entra las variables del pojo Transporte 
 * en declarando los atributos de la clase
 * 
 */

package agencia.miahuas.pojo;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String viaje;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getViaje() {
		return viaje;
	}

	public void setViaje(String viaje) {
		this.viaje = viaje;
	}

}