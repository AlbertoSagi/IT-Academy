import java.util.ArrayList;

public class M04_N2_App {

	public static void main(String[] args) {

		String[] plats = new String[10];
		int[] preus = new int[10];

		Menu comanda1 = new Menu();

		comanda1.omplirPlats(plats);
		comanda1.omplirPreus(preus);
		comanda1.mostrarMenu(plats, preus);

		ArrayList<String> orden = new ArrayList<String>();

		comanda1.guardarComanda(plats, orden);

		int pTotal = comanda1.totalCuenta(preus, plats, orden);

		comanda1.desglose(pTotal);

	}

}
