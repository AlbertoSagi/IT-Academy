import javax.swing.JOptionPane;

public class M01N1F3App {

	public static void main(String[] args) {
		
		String anyNaixemenText = JOptionPane.showInputDialog("Indica l'any de naixement");
		int anyNaixementInt = Integer.parseInt(anyNaixemenText);
		
		boolean trasp = (anyNaixementInt % 4 == 0) && ((anyNaixementInt % 100 != 0) || (anyNaixementInt % 400 == 0));

		String anyTrasp = "L'any " + anyNaixementInt + " �s de trasp�s";
		String anyNoTrasp = "L'any " + anyNaixementInt + " no �s de trasp�s";
		
		if (trasp == true) {
			System.out.println(anyTrasp);
		}else if (trasp == false){
			System.out.println(anyNoTrasp);
		}
	
	}
		
}


