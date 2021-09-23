import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//En aquest exercici també ho vaig sol·lucionar amb una ArrayList

public class M03N1F2B_App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Escriba el nombre de seis ciudades: ");

		String city1 = leer.next();
		String city2 = leer.next();
		String city3 = leer.next();
		String city4 = leer.next();
		String city5 = leer.next();
		String city6 = leer.next();

		List<String> arrayCiutats = new ArrayList<String>();

		arrayCiutats.add(city1);
		arrayCiutats.add(city2);
		arrayCiutats.add(city3);
		arrayCiutats.add(city4);
		arrayCiutats.add(city5);
		arrayCiutats.add(city6);

		Collections.sort(arrayCiutats);

		System.out.println("-----------------------");
		System.out.println("Estas son la ciudades ordenadas alfabéticamente:");
		for (String i : arrayCiutats) {
			System.out.println(i);
		}

	}

}
