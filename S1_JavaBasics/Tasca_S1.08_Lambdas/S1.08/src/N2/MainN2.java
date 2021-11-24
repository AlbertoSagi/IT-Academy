package N2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainN2 {

	public static void main(String[] args) {

		MainN2 n2 = new MainN2();

		// Llista amb la qual treballarem posteriorment, ordenant-la com es demana als
		// apartats següents
		List<String> Llista = Arrays.asList("Hola", "5", "Barcelona", "556", "42", "7", "Dia", "Coche", "Mallorca",
				"10", "Telefono", "10", "25", "11");

		System.out.println("-------------Ordenar la llista per longitud de més curta a més llarga-------------");
		n2.ordenarPorLongitud(Llista, true);

		System.out.println("-------------Ordenar la llista per longitud de més llarga a més curta-------------");
		n2.ordenarPorLongitud(Llista, false);

		System.out.println("-------------Ordenar la llista alfabeticament------------");
		n2.ordenarAlfabeticament(Llista);

		System.out.println("-------------Primer les cadenes que contenen la 'e'------------");
		Llista.stream().sorted(Comparator.comparing((String v) -> v.toLowerCase().contains("e")).reversed())
				.forEach(System.out::println);

		System.out.println("-------------Canviar 'a' per '4'------------");
		n2.replaceCaracters(Llista, "a", "4");

		System.out.println("-------------Mostra nomès els elements numerics------------");
		n2.mostrarNumeros(Llista);

		System.out.println("**********Mètode de la Interface Functional************");
		// Instanciem la interface functional i despres definim el cos del mètodo amb
		// lambdas.
		IN2_InterficeFunctional metode;
		// suma
		metode = (v1, v2) -> v1 + v2;
		System.out.println(metode.operacio(10, 5));
		// resta
		metode = (v1, v2) -> v1 - v2;
		System.out.println(metode.operacio(10, 5));
		// multiplicacio
		metode = (v1, v2) -> v1 * v2;
		System.out.println(metode.operacio(10, 5));
		// divisió
		metode = (v1, v2) -> v1 / v2;
		System.out.println(metode.operacio(10, 5));

	}

	// *****Metodes utilitzant Lambdas, Streams i mètodes referencia*****

	private void ordenarPorLongitud(List<String> llista, boolean asc) {
		if (asc) {
			llista.stream().sorted(Comparator.comparing(v -> v.length())).forEach(System.out::println);
		} else {
			llista.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		}
	}

	private void ordenarAlfabeticament(List<String> llista) {
		llista.stream().sorted(Comparator.comparing(v -> v.charAt(0))).forEach(System.out::println);

	}

	private void replaceCaracters(List<String> llista, String oldValue, String newValue) {
		llista.stream().map(v -> v.replace(oldValue, newValue)).forEach(System.out::println);

	}

	private void mostrarNumeros(List<String> llista) {
		// Expressions regulars
		String exprNumeros = "\\d+";
		llista.stream().filter(v -> v.matches(exprNumeros)).forEach(System.out::println);

	}

}
