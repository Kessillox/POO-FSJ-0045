package cl.fsj.infoclub;

public class MainClass {

	public static void main(String[] args) {

		Auto2 auto = new Auto2();
		System.out.println("Auto listo");
		auto.encenderMotor(true);
		auto.aumentarVelocidad();
		System.out.println(auto.getVelActual());
		auto.aumentarVelocidad(30);
		System.out.println(auto.getVelActual());
		auto.aumentarVelocidad(false, true);
		System.out.println(auto.getVelActual());
		System.out.println("********************************************");
		System.out.println(auto.toString());
		
		Auto2 alfaRomeo = new Auto2("Alfa Romeo", "Giulietta", "Azul eléctrico",200,true);
		System.out.println(alfaRomeo.toString());
	}

}
