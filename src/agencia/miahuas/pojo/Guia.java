/*
 * @autor: Gonzalo Santiago Garcia
 * Fecha de creación: 26 de abril del 2022
 * fecha de actualización:26 de abril del 2022
 * Descripción: en esta parte entra las variables del pojo Transporte 
 * en declarando los atributos de la clase
 * 
 */

package agencia.miahuas.pojo;

public class Guia {
	private long idUsuario;
	private String nombre;
	private String fecha;

	public Guia() {

	}

	public Guia(long idUsuario, String nombre, String fecha) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
