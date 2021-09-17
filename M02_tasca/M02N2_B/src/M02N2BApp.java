import java.util.Scanner;

public class M02N2BApp {

	public static void main(String[] args) {

		System.out.println("PIRAMIDE INVERTIDA DE ASTERISCS:");

		System.out.print("Introduzca la altura: ");
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		sc.close();

		System.out.println();

		for (int numBlancos = 0,
				numAsteriscos = (altura * 2) - 1; numAsteriscos > 0; numBlancos++, numAsteriscos -= 2) {

			// Espacios en blanco
			for (int i = 0; i < numBlancos; i++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int j = numAsteriscos; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
