package N1F1;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

	public ArrayList<String> paraulesAmbA(List<String> lista) {

		ArrayList<String> novaLlista = new ArrayList<String>();
		for (String nombres : lista) {

			if (nombres.length() == 3 && nombres.startsWith("A")) {
				novaLlista.add(nombres);
			}
		}

		return novaLlista;

	}

	public String cadenaAmbComes(List<Integer> numeros) {

		String coma = ",";

		StringBuilder cadenaBuilder = new StringBuilder();

		for (Integer num : numeros) {
			if (num % 2 == 0) {
				cadenaBuilder.append("e" + num.toString());
				cadenaBuilder.append(coma);

			} else {
				cadenaBuilder.append("o" + num.toString());
				cadenaBuilder.append(coma);
			}
		}

		String cadenaFinal = cadenaBuilder.toString();
		cadenaFinal = cadenaFinal.substring(0, cadenaFinal.length() - coma.length());

		return cadenaFinal;
	}

	public ArrayList<String> contenenLletraO(List<String> lista) {

		ArrayList<String> llistaAmbO = new ArrayList<String>();

		for (String str : lista) {
			if (str.contains("o")) {
				llistaAmbO.add(str);
			}
		}

		return llistaAmbO;

	}

	public ArrayList<String> mesDeCincLletres(List<String> lista) {

		ArrayList<String> llistaAmbCincLletres = new ArrayList<String>();

		for (String str : lista) {
			if (str.length() < 5) {
				llistaAmbCincLletres.add(str);
			}
		}

		return llistaAmbCincLletres;

	}

}
