package ex3;

public class Vehicle {

	static {

		System.out.println("Clase carregada només una vegada");
	}
	{
		System.out.println("Clase carregada cada vegada que s'instancia un objecte");
	}

	public Vehicle() {
		System.out.println("Constructor Vehicle");
	}

	public void iniciar() {
		System.out.println("iniciar");
		{
			System.out.println("iniciar en el bloc intern de codi");
		}
	}

	public static void parar() {
		System.out.println("El vehicle es para");
	}

}
