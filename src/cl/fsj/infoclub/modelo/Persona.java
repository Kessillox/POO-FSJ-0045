package cl.fsj.infoclub.modelo;

import cl.fsj.infoclub.interfaces.IPersonaje;

public class Persona implements IPersonaje{

	String nLista;
	String nombre;
	boolean presente;
	
	public Persona() {
		super();
	}

	public Persona(String rut, String nombre, boolean presente) {
		super();
		this.nLista = rut;
		this.nombre = nombre;
		this.presente = presente;
	}

	public String getRut() {
		return nLista;
	}

	public void setRut(String rut) {
		this.nLista = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	@Override
	public String toString() {
		return "Persona [Nº de Lista=" + nLista + ", nombre=" + nombre + ", presente=" + presente + "]";
	}

	@Override
	public void imprimirHola() {

		System.out.println("Hola Mundo");
	}

	@Override
	public int enteros(int x) {

		int total=0;
		total= x+1;
		return total;
	}
	
	
	
}
