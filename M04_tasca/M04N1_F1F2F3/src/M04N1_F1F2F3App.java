
import java.util.ArrayList;

public class M04N1_F1F2F3App {

	public static void main(String[] args) {

		String[] plats = new String[10];
		int[] preus = new int[10];

		MenuF1F2F3 comanda1 = new MenuF1F2F3();

		comanda1.omplirPlats(plats);
		comanda1.omplirPreus(preus);
		comanda1.mostrarMenu(plats, preus);

		ArrayList<String> orden = new ArrayList<String>();

		comanda1.guardarComanda(plats, orden);

		int pTotal = comanda1.totalCuenta(preus, plats, orden);

		comanda1.desglose(pTotal);

	}

}
