package cl.fsj.infoclub;

public class Persona {
	
	private String nombre;
	private String rut;
	private double altura;
	private Lapiz lapiz;
	
	
	
	public Persona(String nombre, String rut, double altura, Lapiz lapiz) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
		this.lapiz = lapiz;
	}

	public Persona(String nombre, String rut, double altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
	}

	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Lapiz getLapiz() {
		return lapiz;
	}

	public void setLapiz(Lapiz lapiz) {
		this.lapiz = lapiz;
	}
	
	
	
	/* Altura
	 * Ancho
	 * Tipo de Material
	 * Color
	 * 
	 * Constructores para altura y tipo de material, vacío, lleno o completo
	 * getters y setters
	 */
	
	public Cuaderno reciboCuaderno (Cuaderno cuadernito) {
		return cuadernito;
	}


}
