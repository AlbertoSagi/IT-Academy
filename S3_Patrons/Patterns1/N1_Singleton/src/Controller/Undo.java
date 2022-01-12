package Controller;

import java.util.HashMap;
import java.util.Map;

public class Undo {

	// Crea un objeto de Undo
	private static Undo instance = new Undo();

	// Hacer el constructor privado para que la clase no pueda ser instanciada
	private Undo() {

	}

	// Acceder al �nico objeto disponible
	public static Undo getInstance() {
		return instance;
	}

	// Crear un HashMap que contiene los commands utilizados
	Map<Integer, String> commands = new HashMap<Integer, String>();

	// M�todo para a�adir commands
	public void addCommand(Integer value, String action) {
		commands.put(value, action);

	}

	// M�todo para eliminar un command
	public void deleteCommand(Integer value) {
		commands.remove(value);

	}

	// M�todo para mostrar todos los comandos previos
	public void getPreviousCommand() {
		System.out.println(commands);
	}

}
