import javax.swing.JOptionPane;

public class M02N1F1App {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Dime tu nombre y apellidos");
		char char_nom[] = nom.toCharArray();

		for (int i = 0; i < char_nom.length; i++) {
			System.out.println(char_nom[i]);

		}

	}
}
