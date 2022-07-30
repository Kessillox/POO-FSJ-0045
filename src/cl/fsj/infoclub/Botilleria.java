package cl.fsj.infoclub;

public class Botilleria {

	private String nombre;
	private Cerveza cerveza;
	
	public Botilleria() {
		super();
	}
	
	public Botilleria(String nombre, Cerveza cerveza) {
		super();
		this.nombre = nombre;
		this.cerveza = cerveza;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Cerveza getCerveza() {
		return cerveza;
	}
	
	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}
	
	
}
