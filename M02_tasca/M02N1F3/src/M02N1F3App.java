import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class M02N1F3App {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Dime tu nombre y apellidos");

		char noms[] = nom.toCharArray();

		Map<Character, Integer> ocurrencias = new HashMap<Character, Integer>();

		for (char i : noms) {

			if (ocurrencias.containsKey(i)) {
				int repeticionsActuals = ocurrencias.get(i); // com ja existeix hi haurà introduit un valor de 1 o un
																// repetionsActuals, al qual li sumem 1 posteriorment.
				ocurrencias.put(i, repeticionsActuals + 1);

			} else {
				ocurrencias.put(i, 1); // Como no existeix, introduïm un 1 com a valor ja que és la primera vegada que
										// es troba aquest valor.
			}
		}

		System.out.println(ocurrencias);

	}

}
