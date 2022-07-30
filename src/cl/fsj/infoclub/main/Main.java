package cl.fsj.infoclub.main;

import java.util.ArrayList;

import cl.fsj.infoclub.modelo.Estudiante;
import cl.fsj.infoclub.modelo.Persona;
import cl.fsj.infoclub.modelo.Profesor;

public class Main {

	public static void main(String[] args) {
		int cant;
		//Lista de Estudiantes, de tipo Estudiante
//		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		
		// Lista de Profesores, de tipo Profesor
//		ArrayList<Profesor> listaProfesor = new ArrayList<>();
		
		//Carga de estudiantes para la lista de estudiantes
/*		listaEstudiantes.add(new Estudiante("1", "Rodrigo", true, 30));
		listaEstudiantes.add(new Estudiante("2", "Luciano", true, 18));
		listaEstudiantes.add(new Estudiante("3", "Oscarito", true, 8));
		listaEstudiantes.add(new Estudiante("4", "Silvia", true, 35));
		listaEstudiantes.add(new Estudiante("5", "Paulette", true, 15));
		listaEstudiantes.add(new Estudiante("6", "Paula", true, 18));
		listaEstudiantes.add(new Estudiante("7", "Eduardo", true, 10));
		listaEstudiantes.add(new Estudiante("8", "Sebastian", true, 16));
		listaEstudiantes.add(new Estudiante("9", "Mercedes", true, 25));
		listaEstudiantes.add(new Estudiante("10", "Rolando", true, 24));
		listaEstudiantes.add(new Estudiante("11", "Constanza", true, 27));
		listaEstudiantes.add(new Estudiante("12", "Lisbeth", true, 37));
		listaEstudiantes.add(new Estudiante("13", "Patricio", true, 23));
		listaEstudiantes.add(new Estudiante("14", "Claudia", false, 28));
		listaEstudiantes.add(new Estudiante("15", "Cossio", false, 40));
		listaEstudiantes.add(new Estudiante("16", "Franco", false, 67));
		listaEstudiantes.add(new Estudiante("17", "Nicolás", false, 57));
		listaEstudiantes.add(new Estudiante("18", "Bossel", false, 12));
*/		
		//Carga de profesores, para lista profesores
/*		listaProfesor.add(new Profesor("1", "Cristian", true));
		listaProfesor.add(new Profesor("2", "Kessi", true));
*/		
		
		//Recorrer e imprimir lista Profesor
/*		for(Profesor profesor : listaProfesor) {
			System.out.println(profesor.toString());
		}
*/		
		//Recorrer e imprimir lista de Estudiantes
/*		for(Estudiante estudiante: listaEstudiantes) {
			System.out.println(estudiante.toString());
		}
*/
		//****************************Nueva Forma*********************************		
		
		//Lista de tipo Persona
		ArrayList<Persona> lista = new ArrayList<>();

		//carga de lista persona, con Estdiantes y profesores de tipo Estudiante y Profesor
		lista.add(new Estudiante("1", "Rodrigo", true, 26));
		lista.add(new Estudiante("2", "Luciano", true, 18));
		lista.add(new Profesor("1", "Cristian", true));
		
		//Recorredido e Impresión de lista
//		for(Persona persona: lista) {
//			Estudiante estudiante = (Estudiante) persona;
//			System.out.println(persona.getClass().getSimpleName());
//			System.out.println(estudiante.getEdad());
//		}
//		
		cant = lista.size();
		Persona p = new Persona();
		
		System.out.println(p.enteros(cant));
		
		Estudiante e = new Estudiante();
		
		System.out.println(e.enteros(cant));
		
	}		
}
