import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	// Rellenar array de platos
	public String[] omplirPlats(String[] plats) {

		for (int i = 0; i < plats.length; i++) {
			plats[i] = JOptionPane.showInputDialog("Introduce plato " + (i + 1));
		}

		return plats;
	}

	// Rellenar array de precios
	public int[] omplirPreus(int[] preus) {

		for (int i = 0; i < preus.length; i++) {
			preus[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio del plato " + (i + 1)));
		}

		return preus;
	}

	// Mostrar el menú por pantalla
	public void mostrarMenu(String[] plats, int[] preus) {

		System.out.printf("%10s %n %n", "MENU");

		for (int i = 0; i < 10; i++) {

			System.out.println((i + 1) + ". " + plats[i] + "----> " + preus[i]);

		}
		System.out.println();

	}

	// Metodo que recibe una Lista para almacenar la orden del cliente
	public ArrayList<String> guardarComanda(String[] plats, ArrayList<String> orden) {

		String plato;
		int num = 1;
		int opcion;
		Boolean seguir = true;

		Scanner leer = new Scanner(System.in);

		System.out.println("Haga su orden, indicando el nombre del plato: \n");

		do {

			System.out.println("plato " + num + ":");

			plato = leer.next();

			try {

				if (Arrays.asList(plats).contains(plato)) {
					orden.add(plato);
				} else {
					throw new Exception("Este plato no está disponible");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

			opcion = -1;
			while (opcion != 1 && opcion != 0) {
				try {
					// En cuanto el cliente no quiera nada más se saldrá del bucle.
					System.out.println("Quiere algún plato más? 1:SI o 0:NO:");
					opcion = Integer.parseInt(leer.next());

					if (opcion == 1) {
						seguir = true;
						num++;
					} else if (opcion == 0) {
						seguir = false;
					} else {
						throw new Exception("Lo siento. Debe introducir la opcion 1 o 0");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} while (seguir == true);
		leer.close();

		return orden;

	}

	// Comparar el la orden del cliente con la array Plats. Para ello pasamos la
	// ArrayPlats a una Arraylist.
	// En el caso de que el menu contenga lo que pide el cliente, se le suma a la
	// cuenta, de lo contrario se lo hacemos saber.
	public int totalCuenta(int[] preus, String[] plats, ArrayList<String> orden) {
		int i = 0;
		int pTotal = 0;
		while (i < orden.size()) {

			if (Arrays.asList(plats).contains(orden.get(i))) {
				pTotal = pTotal + preus[i];
				i++;

			} else {
				System.out.println("Lo siento no tenemos " + orden.get(i));
				i++;

			}

		}

		System.out.println("\nEl total de su cuenta es: " + pTotal + "€\n");

		return pTotal;
	}

	// Desglose del total de la comanda en billetes y monedas.
	public void desglose(int pTotal) {

		int resto = 0;
		int uno;
		int dos;
		int cinc;
		int deu;
		int vint;
		int cinquanta;
		int cent;
		int cinc_cents;

		cinc_cents = pTotal / 500;
		resto = pTotal % 500;

		cent = resto / 100;
		resto = resto % 100;

		cinquanta = resto / 50;
		resto = resto % 50;

		vint = resto / 20;
		resto = resto % 20;

		deu = resto / 10;
		resto = resto % 10;

		cinc = resto / 50;
		resto = resto % 50;

		dos = resto / 2;
		resto = resto % 2;

		uno = resto / 1;

		System.out.println("BILLETES Y MONEDAS PARA PAGAR LA CUENTA: \n");
		if (cinc_cents != 0) {
			System.out.println("Billetes de quinientos: " + cinc_cents);
		}
		if (cent != 0) {
			System.out.println("Billetes de cien: " + cent);
		}
		if (cinquanta != 0) {
			System.out.println("Billetes de cincuenta: " + cinquanta);
		}
		if (vint != 0) {
			System.out.println("Billetes de veinte: " + vint);
		}
		if (deu != 0) {
			System.out.println("Billetes de diez: " + deu);
		}
		if (cinc != 0) {
			System.out.println("Billetes de cinco: " + cinc);
		}
		if (dos != 0) {
			System.out.println("Monedas de dos euros: " + dos);
		}
		if (uno != 0) {
			System.out.println("Monedas de un euro: " + uno);
		}

	}

}
