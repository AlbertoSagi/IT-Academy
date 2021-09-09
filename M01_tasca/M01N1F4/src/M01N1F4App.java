
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class M01N1F4App {

	public static void main(String[] args) {
		
		//Se introduce fecha mediante JOptionPane, serán en tipo String
		
		String diaNaixemenText = JOptionPane.showInputDialog("¿En quin día vas néixer?");
				
		String mesNaixemenText = JOptionPane.showInputDialog("¿I en quin mes?");
				
		String anyNaixemenText = JOptionPane.showInputDialog("¿I en quin any?");
		int anyNaixementInt = Integer.parseInt(anyNaixemenText);  // Convierto el String a int ya que lo utilizaré más adelante en el condicional
		
		//Defino variable del nombre con apellidos
		String nomCognoms = "Lionel Messi Cuccittini";
				
		//Defino variable booleana
		boolean trasp = (anyNaixementInt % 4 == 0) && ((anyNaixementInt % 100 != 0) || (anyNaixementInt % 400 == 0));
		
		//Defino las dos variables con texto
		String anyTrasp = "L'any " + anyNaixementInt + " és de traspàs";
		String anyNoTrasp = "L'any " + anyNaixementInt + " no és de traspàs";
		
		//Muestro en pantalla la primera frase
		System.out.println("El meu nom és "+ nomCognoms);
		
		//Diseño formato de la fecha
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
		//Recojo los datos proporcionados en una variable tipo String
		String str_date = diaNaixemenText + "/" + mesNaixemenText + "/" + anyNaixemenText;
		//Transformo la fecha tipo String en tipo LocalDate.
		LocalDate fecha = LocalDate.parse(str_date, format1);
		
		//Muestro en pantalla la segunda frase con la fecha
		System.out.println("Vaig nèixer el "+ fecha);
		
		//Muestro en pantalla última frase indicando si el año es de traspaso o no.				
		if (trasp == true) {
			System.out.println(anyTrasp);
		}else if (trasp == false){
			System.out.println(anyNoTrasp);
		}
		
	}

}
