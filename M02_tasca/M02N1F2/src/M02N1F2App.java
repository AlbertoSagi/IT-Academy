import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class M02N1F2App {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Dime tu nombre y apellidos");

		List<Character> chars = new ArrayList<>();

		for (char ch : nom.toCharArray()) {
			chars.add(ch);
		}

		for (char nombres : chars) {

			if (nombres == 'a' || nombres == 'e' || nombres == 'i' || nombres == 'o' || nombres == 'u') {
				System.out.println(nombres + " Vocal");

			} else if (nombres == ' ') {
				System.out.println(" ");

			} else if (Character.isDigit(nombres)) {
				System.out.println(nombres + " Els noms de persones no contenen números!");

			} else {
				System.out.println(nombres + " Consonante");
			}

		}

	}

}
