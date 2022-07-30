package cl.fsj.infoclub;

public class Auto {

	private double altura;
	private double ancho;
	private String tipoMaterial;
	private String color;
	
	public Auto() {
		super();
	}
	
	public Auto(double altura, String tipoMaterial) {
		super();
		this.altura = altura;
		this.tipoMaterial = tipoMaterial;
	}
	
	public Auto(double altura, double ancho, String tipoMaterial, String color) {
		super();
		this.altura = altura;
		this.ancho = ancho;
		this.tipoMaterial = tipoMaterial;
		this.color = color;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	
	
	
}
