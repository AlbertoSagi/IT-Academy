package ex4;

public class Vehicle {

	private final int cp = 87952;
	private static final int telefono = 660332598; // para acceder a este atributo solo se puede a partir de un método
													// static.

	public Vehicle() {

	}

	public String getCP() {
		return "El cp es: " + cp;
	}

	public static String getTelefono() {
		return "El telefono es: " + telefono;

	}

}
