package nivell2;

public class Main {

	public static void main(String[] args) {

		Raton ratonCampo = new Raton();
		Jerbo jerboCampo = new Jerbo();
		Hamster hamsterCasero = new Hamster();

		Rosegador[] rosegadors = new Rosegador[3];
		rosegadors[0] = ratonCampo;
		rosegadors[1] = jerboCampo;
		rosegadors[2] = hamsterCasero;

		for (int i = 0; i < 3; i++) {
			System.out.println(rosegadors[i].getClass().getName() + ": " + rosegadors[i].comer() + ", "
					+ rosegadors[i].dormir() + ", " + rosegadors[i].saltar() + "\n");
		}

	}

}
