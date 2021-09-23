import java.util.Arrays;
import java.util.Scanner;

public class M03N1F3_App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Escriba el nombre de seis ciudades: ");

		String[] ciutats = new String[6];

		for (int i = 0; i < ciutats.length; i++) {
			ciutats[i] = leer.next();
		}
		leer.close();

		String[] ciutatsMod = new String[6];

		for (int i = 0; i < ciutatsMod.length; i++) {
			ciutatsMod[i] = ciutats[i].replace('a', '4');
		}

		Arrays.sort(ciutatsMod);
		System.out.println("-----------------------------");
		System.out.println("Estas son la ciudades modificadas ordenadas alfabéticamente:");

		for (String i : ciutatsMod) {
			System.out.println(i);
		}

	}
}
