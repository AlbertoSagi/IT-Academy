package N1F1;

import java.util.Arrays;
import java.util.List;

public class MainFase1 {

	public static void main(String[] args) {

		System.out.println("********FASE 1*********\n");
		System.out.println("--------EX.1----------\n");

		List<String> noms = Arrays.asList("Alberto", "Sergio", "Aroa", "alba", "Jose", "Ara", "alo", "Aro", "Ali",
				"Ira", "era");

		Metodos m = new Metodos();
		System.out.println(m.paraulesAmbA(noms) + "\n");

		System.out.println("--------EX.2---------\n");

		List<Integer> numeros = Arrays.asList(1, 5, 42, 23, 15, 10, 153, 41, 69, 70, 82);
		System.out.println(m.cadenaAmbComes(numeros) + "\n");

		System.out.println("--------EX.3---------\n");

		System.out.println(m.contenenLletraO(noms) + "\n");

		System.out.println("--------EX.4---------\n");

		System.out.println(m.mesDeCincLletres(noms) + "\n");

		System.out.println("--------EX.5---------\n");

		List<String> mesos = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
				"Setembre", "Octubre", "Novembre", "Decembre");

		mesos.forEach((mes) -> System.out.print(mes + " "));
		System.out.println("\n");

		System.out.println("--------EX.6---------\n");

		mesos.forEach(System.out::println);

	}

}
