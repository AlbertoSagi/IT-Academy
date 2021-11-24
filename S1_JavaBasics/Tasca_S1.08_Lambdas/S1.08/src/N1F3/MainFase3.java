package N1F3;

public class MainFase3 {

	public static void main(String[] args) {

		I03_InterfaceFuncional i03 = (nom) -> {

			StringBuilder str = new StringBuilder(nom);
			nom = str.reverse().toString();

			return nom;
		};

		System.out.println(i03.reverse("Alberto"));

	}

}
