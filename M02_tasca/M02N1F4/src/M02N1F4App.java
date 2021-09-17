import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class M02N1F4App {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Dime tu nombre:");

		List<Character> nomChars = new ArrayList<>();

		for (char ch : nom.toCharArray()) {
			nomChars.add(ch);
		}

		String cognom = JOptionPane.showInputDialog("Dime tu apellido:");

		List<Character> cognomChars = new ArrayList<>();

		for (char chs : cognom.toCharArray()) {
			cognomChars.add(chs);
		}

		List<Character> nomComplet = new ArrayList<>();

		nomComplet.addAll(nomChars);
		nomComplet.add(' ');
		nomComplet.addAll(cognomChars);

		System.out.println(nomComplet);

	}

}
