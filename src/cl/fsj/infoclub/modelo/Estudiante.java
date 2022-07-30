package cl.fsj.infoclub.modelo;

public class Estudiante extends Persona{
	
	int edad;

//	public Estudiante(int edad) {
//		super();
//		this.edad = edad;
//	}

	public Estudiante() {
		super();
	}

	public Estudiante(String rut, String nombre, boolean presente, int edad) {
		super(rut, nombre, presente);
		this.edad = edad;
	}

//	public Estudiante(String rut, String nombre, boolean presente) {
//		super(rut, nombre, presente);
//	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

//	@Override
//	public String toString() {
//		return "Estudiante [edad=" + edad + ", nLista=" + nLista + ", nombre=" + nombre + ", presente=" + presente
//				+ "]";
//	}
//	
	
	
}
