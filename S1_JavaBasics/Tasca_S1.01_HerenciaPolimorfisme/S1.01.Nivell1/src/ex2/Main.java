package ex2;

public class Main {

	public static void main(String[] args) {

		System.out.println(Vehicle.parar()); // Al mètodo static accedim per la clase, aquest mètodo no pertany a cap
												// objecte de la clase. Pertany a la clase.

		Vehicle v = new Vehicle();
		System.out.println(v.accelerar()); // Per accedir al mètodo no-static ho fem mitjançant una instància de la
											// clase.

	}

}
