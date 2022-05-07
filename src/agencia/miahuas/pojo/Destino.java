/*
 * @Autor:Gonzalo Santiago García					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	   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se presentan la función main 
 */

package agencia.miahuas.pojo;

public class Destino {

	private long idlugar;
	private String nombre;
	private String direccion;
	private String telefono;
	private int codigoPost;
	// se crea el contructor vacio de Destino
	public Destino() {

	}

	// craemos el constructor Destino
	public Destino(long idlugar, String nombre, String direccion, String telefono, int codigoPost) {

		this.idlugar = idlugar;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoPost = codigoPost;
	}
	
	
	
	public int getCodigoPost() {
		return codigoPost;
	}

	public void setCodigoPost(int codigoPost) {
		this.codigoPost = codigoPost;
	}

	public long getIdlugar() {
		return idlugar;
	}

	public void setIdlugar(long idlugar) {
		this.idlugar = idlugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
