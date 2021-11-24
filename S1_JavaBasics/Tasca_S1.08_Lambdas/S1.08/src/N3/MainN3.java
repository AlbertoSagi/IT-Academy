package N3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainN3 {

	public static void main(String[] args) {

		MainN3 n3 = new MainN3();

		List<Alumne> alumnes = new ArrayList<Alumne>();
		alumnes.add(new Alumne("Albert", 33, "Java", 8));
		alumnes.add(new Alumne("Sergi", 25, "PHP", 7));
		alumnes.add(new Alumne("Marta", 34, "Java", 9));
		alumnes.add(new Alumne("Fran", 23, "Node", 5));
		alumnes.add(new Alumne("Noa", 17, "Java", 6));
		alumnes.add(new Alumne("Oscar", 17, "PHP", 4));
		alumnes.add(new Alumne("Edgar", 18, "PHP", 3));
		alumnes.add(new Alumne("Elisa", 17, "PHP", 4));
		alumnes.add(new Alumne("Antonio", 17, "Java", 4));
		alumnes.add(new Alumne("Felipe", 17, "Java", 7));

		// Recorre tots els alumnes de la llista i mostra els seus noms i edat per
		// pantalla
		alumnes.forEach((al) -> System.out.println("Nom: " + al.getNom() + ", Edat: " + al.getEdat()));

//		for (Alumne al : alumnes) {
//
//			System.out.println("Nom: " + al.getNom() + ", Edat: " + al.getEdat());
//
//		}

		System.out.println("------------Noms per la A-----------------");
		n3.getNomsAmbA(alumnes, "A").forEach(al -> System.out.println(al.toString()));

		System.out.println("------------Alumnes Aprovats-----------------");
		n3.getAlumnesAprovats(alumnes).forEach(al -> System.out.println(al.toString()));

		System.out.println("------------Alumnes Aprovats que no facin PHP-----------------");
		n3.getAlumnesAprovatsNoPHP(alumnes).forEach(al -> System.out.println(al.toString()));

		System.out.println("------------Alumnes de Java majors d'edat-----------------");
		n3.getAlumnesJavaMajorsEdat(alumnes).forEach(al -> System.out.println(al.toString()));
	}

	public List<Alumne> getNomsAmbA(List<Alumne> llistaAlumnes, String starts) {
		return llistaAlumnes.stream().filter(al -> al.getNom().startsWith(starts)).collect(Collectors.toList());

	}

	public List<Alumne> getAlumnesAprovats(List<Alumne> llistaAlumnes) {
		return llistaAlumnes.stream().filter(al -> al.getNota() >= 5).collect(Collectors.toList());
	}

	public List<Alumne> getAlumnesAprovatsNoPHP(List<Alumne> llistaAlumnes) {
		return llistaAlumnes.stream().filter(al -> al.getNota() >= 5 && al.getCurs() != "PHP")
				.collect(Collectors.toList());
	}

	public List<Alumne> getAlumnesJavaMajorsEdat(List<Alumne> llistaAlumnes) {
		return llistaAlumnes.stream().filter(al -> al.getCurs() == "Java" && al.getEdat() >= 18)
				.collect(Collectors.toList());
	}

}
