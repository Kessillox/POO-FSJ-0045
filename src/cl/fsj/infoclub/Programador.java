package cl.fsj.infoclub;

public class Programador extends Persona {

	private String lenguaje;

	public Programador(String nombre, String rut, double altura, Lapiz lapiz, String lenguaje) {
		super(nombre, rut, altura, lapiz);
		this.lenguaje = lenguaje;
	}

	public Programador(String nombre, String rut, double altura, Lapiz lapiz) {
		super(nombre, rut, altura, lapiz);
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
}
