import java.util.Scanner;

public class M03N1F1App {

	public static void main(String[] args) {

		String city1, city2, city3, city4, city5, city6;

		Scanner leer = new Scanner(System.in);

		System.out.println("Escriba el nombre de seis ciudades: ");

		city1 = leer.next();
		city2 = leer.next();
		city3 = leer.next();
		city4 = leer.next();
		city5 = leer.next();
		city6 = leer.next();

		System.out.println(city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ", " + city6);

	}

}
