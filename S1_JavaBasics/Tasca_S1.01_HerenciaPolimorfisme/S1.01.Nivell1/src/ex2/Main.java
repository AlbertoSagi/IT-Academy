package ex2;

public class Main {

	public static void main(String[] args) {

		System.out.println(Vehicle.parar()); // Al m�todo static accedim per la clase, aquest m�todo no pertany a cap
												// objecte de la clase. Pertany a la clase.

		Vehicle v = new Vehicle();
		System.out.println(v.accelerar()); // Per accedir al m�todo no-static ho fem mitjan�ant una inst�ncia de la
											// clase.

	}

}
