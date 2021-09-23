import java.util.Arrays;
import java.util.Scanner;

public class M03N1F2App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Escriba el nombre de seis ciudades: ");

		String[] ciutats = new String[6];

		for (int i = 0; i < ciutats.length; i++) {
			ciutats[i] = leer.next();
		}
		leer.close();

		Arrays.sort(ciutats);

		System.out.println("-----------------------------");
		System.out.println("Estas son la ciudades ordenadas alfabéticamente:");

		for (String i : ciutats) {
			System.out.println(i);
		}

	}

}
