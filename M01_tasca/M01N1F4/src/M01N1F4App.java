
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class M01N1F4App {

	public static void main(String[] args) {
		
		//Se introduce fecha mediante JOptionPane, ser�n en tipo String, y lo convertimos en int para usarlos posteriormente en el LocalDate y condicional
		
		String diaNaixemenText = JOptionPane.showInputDialog("�En quin d�a vas n�ixer?");
		int diaNaixementInt = Integer.parseInt(diaNaixemenText);
		
		String mesNaixemenText = JOptionPane.showInputDialog("�I en quin mes?");
		int mesNaixementInt = Integer.parseInt(mesNaixemenText);
		
		String anyNaixemenText = JOptionPane.showInputDialog("�I en quin any?");
		int anyNaixementInt = Integer.parseInt(anyNaixemenText);  
		
		//Defino variable del nombre con apellidos
		String nomCognoms = "Lionel Messi Cuccittini";
				
		//Defino variable booleana
		boolean trasp = (anyNaixementInt % 4 == 0) && ((anyNaixementInt % 100 != 0) || (anyNaixementInt % 400 == 0));
		
		//Defino las dos variables con texto
		String anyTrasp = "L'any " + anyNaixementInt + " �s de trasp�s";
		String anyNoTrasp = "L'any " + anyNaixementInt + " no �s de trasp�s";
		
		//Muestro en pantalla la primera frase
		System.out.println("El meu nom �s "+ nomCognoms);
		
		//Dise�o formato de la fecha y recojo datos proporcionados int en variable de tipo LocalDate
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.of(anyNaixementInt, mesNaixementInt, diaNaixementInt);
		System.out.println("Vaig n�ixer el: " + date.format(format1));
		
		//Muestro en pantalla �ltima frase indicando si el a�o es de traspaso o no.				
		if (trasp == true) {
			System.out.println(anyTrasp);
		}else if (trasp == false){
			System.out.println(anyNoTrasp);
		}
		
	}

}
