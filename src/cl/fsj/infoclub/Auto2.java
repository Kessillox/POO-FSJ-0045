package cl.fsj.infoclub;

public class Auto2 {
	
	private String marca;
	private String modelo;
	private String color;
	private int velActual;
	private boolean motorEncendido;
	
	public Auto2() {
		super();
	}

	public Auto2(String marca, String modelo, String color, int velActual, boolean motorEncendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velActual = velActual;
		this.motorEncendido = motorEncendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelActual() {
		return velActual;
	}

	public void setVelActual(int velActual) {
		this.velActual = velActual;
	}

	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}
	
	public void aumentarVelocidad(int velocidad){ 
		
		velActual = velActual + velocidad;
	}
	
	public void aumentarVelocidad() {
		velActual = velActual + 10;
	}
	
	public void aumentarVelocidad(boolean maxCiudad, boolean maxCarretera) {
		if (maxCiudad) {
			velActual = velActual + 50;
		}
		if (maxCarretera) {
			velActual = velActual + 100;
		}
	}
	
	public void encenderMotor(boolean motorEncendido) {
		if (motorEncendido) {
			this.motorEncendido = true;
			System.out.println("Motor encendido");
		}
	}

	@Override
	public String toString() {
		return "Auto2 [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velActual=" + velActual
				+ ", motorEncendido=" + motorEncendido + "]";
	}
	
	
}