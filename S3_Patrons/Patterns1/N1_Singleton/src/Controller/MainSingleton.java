package Controller;

public class MainSingleton {

	public static void main(String[] args) {

		// Coger el único objeto disponible
		// Undo obj = new Undo(); no podemos porque el constructor es privado.
		Undo obj = Undo.getInstance();

		obj.addCommand(1, "Insertar letras");
		obj.addCommand(2, "Borrar letras");
		obj.addCommand(3, "Insertar números");

		obj.getPreviousCommand();

		obj.deleteCommand(3);
		obj.getPreviousCommand();

		Undo obj1 = Undo.getInstance();

	}

}
