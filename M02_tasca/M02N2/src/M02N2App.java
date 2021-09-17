import java.util.Scanner;

public class M02N2App {

	public static void main(String[] args) {

		// **Primera part: Escala de nombres

		System.out.println("ESCALA DE NOMBRES:");

		System.out.print("Introduzca la altura de la escalera de números: ");
		Scanner scan = new Scanner(System.in);
		int alçada = scan.nextInt();
		scan.close();

		for (int step = 1; step <= alçada; step++) {
			for (int num = 1; num <= step; num++) {
				System.out.print(num);
			}
			System.out.println();
		}

	}
}
