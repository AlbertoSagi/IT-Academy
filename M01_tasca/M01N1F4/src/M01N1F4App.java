
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class M01N1F4App {

	public static void main(String[] args) {
		
		//Se introduce fecha mediante JOptionPane, serán en tipo String, y lo convertimos en int para usarlos posteriormente en el LocalDate y condicional
		
		String diaNaixemenText = JOptionPane.showInputDialog("¿En quin día vas néixer?");
		int diaNaixementInt = Integer.parseInt(diaNaixemenText);
		
		String mesNaixemenText = JOptionPane.showInputDialog("¿I en quin mes?");
		int mesNaixementInt = Integer.parseInt(mesNaixemenText);
		
		String anyNaixemenText = JOptionPane.showInputDialog("¿I en quin any?");
		int anyNaixementInt = Integer.parseInt(anyNaixemenText);  
		
		//Defino variable del nombre con apellidos
		String nomCognoms = "Lionel Messi Cuccittini";
				
		//Defino variable booleana
		boolean trasp = (anyNaixementInt % 4 == 0) && ((anyNaixementInt % 100 != 0) || (anyNaixementInt % 400 == 0));
		
		//Defino las dos variables con texto
		String anyTrasp = "L'any " + anyNaixementInt + " és de traspàs";
		String anyNoTrasp = "L'any " + anyNaixementInt + " no és de traspàs";
		
		//Muestro en pantalla la primera frase
		System.out.println("El meu nom és "+ nomCognoms);
		
		//Diseño formato de la fecha y recojo datos proporcionados int en variable de tipo LocalDate
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.of(anyNaixementInt, mesNaixementInt, diaNaixementInt);
		System.out.println("Vaig nèixer el: " + date.format(format1));
		
		//Muestro en pantalla última frase indicando si el año es de traspaso o no.				
		if (trasp == true) {
			System.out.println(anyTrasp);
		}else if (trasp == false){
			System.out.println(anyNoTrasp);
		}
		
	}

}
