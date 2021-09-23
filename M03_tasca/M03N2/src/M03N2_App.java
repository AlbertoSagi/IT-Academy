import java.util.Scanner;

public class M03N2_App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int[][] notas = new int[3][5];

		int alumno = 1;
		int nota = 1;

		for (int i = 0; i < 5; i++) {

			System.out.println("Notas Alumno " + alumno + ":");
			alumno++;

			for (int j = 0; j < 3; j++) {

				System.out.println("Introduzca la nota " + nota + ":");
				notas[j][i] = leer.nextInt();
				nota++;
			}
			nota = 1;
		}
		leer.close();

		int media;
		int sumaNotas = 0;
		alumno = 1;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {

				sumaNotas = sumaNotas + notas[j][i];
			}

			media = sumaNotas / 3;

			if (media < 5) {
				System.out.println("L'alumne " + alumno + " ha supés amb un " + media);
			} else {
				System.out.println("L'alumne " + alumno + " ha aprovat amb un " + media);
			}
			alumno++;
			sumaNotas = 0;

		}
	}

}
