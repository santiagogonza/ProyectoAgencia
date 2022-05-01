/*
 * @Autor:Gonzalo Santiago García						   
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
	
	public Destino() {
		
	}
	
	//craemos el constructor Destino
	public Destino(long idlugar,String  nombre, String direccion ,String telefono) {
		
		this.idlugar= idlugar;
		this.nombre= nombre;
		this.direccion= direccion;
		this.telefono= telefono;
		
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

