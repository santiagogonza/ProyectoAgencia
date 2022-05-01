
/*
 * @Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 25 de abril del 2022				   
 Fecha_de_actualización: 25 de abril del 2022				   
 Descripción: se declaran las variables que se va a utilizar dentro del programa
 */
package agencia.miahuas.pojo;

//import java.util.List;

public class Viaje {

	private long codigo;
	private String destino;
	private String salida;
	private String regreso;
	private int precio;

//se crea el constructor vacio
	public Viaje() {

	}

	public Viaje(long codigo, String destino, String salida, String regreso, int precio) {
		this.codigo = codigo;
		this.destino = destino;
		this.salida = salida;
		this.regreso = regreso;
		this.precio = precio;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getRegreso() {
		return regreso;
	}

	public void setRegreso(String regreso) {
		this.regreso = regreso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	
}	
