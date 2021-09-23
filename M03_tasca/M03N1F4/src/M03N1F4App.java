import java.util.Scanner;

public class M03N1F4App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Escriba el nombre de seis ciudades: ");

		String[] ciutats = new String[6];

		for (int i = 0; i < ciutats.length; i++) {
			ciutats[i] = leer.next();
		}
		leer.close();

		char[] ciutat1 = ciutats[0].toCharArray();
		char[] ciutat2 = ciutats[1].toCharArray();
		char[] ciutat3 = ciutats[2].toCharArray();
		char[] ciutat4 = ciutats[3].toCharArray();
		char[] ciutat5 = ciutats[4].toCharArray();
		char[] ciutat6 = ciutats[5].toCharArray();

		for (int i = 0; i < ciutat1.length; i++) {
			System.out.print(ciutat1[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat1.length - 1; i >= 0; i--) {
			System.out.print(ciutat1[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < ciutat2.length; i++) {
			System.out.print(ciutat2[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat2.length - 1; i >= 0; i--) {
			System.out.print(ciutat2[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < ciutat3.length; i++) {
			System.out.print(ciutat3[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat3.length - 1; i >= 0; i--) {
			System.out.print(ciutat3[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < ciutat4.length; i++) {
			System.out.print(ciutat4[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat4.length - 1; i >= 0; i--) {
			System.out.print(ciutat4[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < ciutat5.length; i++) {
			System.out.print(ciutat5[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat5.length - 1; i >= 0; i--) {
			System.out.print(ciutat5[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < ciutat6.length; i++) {
			System.out.print(ciutat6[i]);
		}
		System.out.print(" - ");
		for (int i = ciutat6.length - 1; i >= 0; i--) {
			System.out.print(ciutat6[i]);
		}
		System.out.println(" ");

	}
}
