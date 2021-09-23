import java.util.Scanner;

public class M03N3_App {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.print("Seqüència de Fibonacci fins numero: ");
		int num = leer.nextInt();
		leer.close();

		int numero = 1;
		int numAnterior = 0;
		int sumaNum;

		System.out.print(numAnterior + " ");
		System.out.print(numero + " ");

		for (int i = 1; i <= num - 2; i++) {

			sumaNum = numero + numAnterior;

			System.out.print(sumaNum + " ");

			numAnterior = numero;
			numero = sumaNum;

		}

	}

}
