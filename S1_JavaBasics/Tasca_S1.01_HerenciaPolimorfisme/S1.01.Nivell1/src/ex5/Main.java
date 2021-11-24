package ex5;

public class Main {

	public static void main(String[] args) {

		Animal classone1 = new Animal();
		System.out.println(classone1.correr());
		System.out.println(classone1.correr("mamifer"));
		System.out.println(classone1.correr("mamifer", 25));

		System.out.println("\n---------Els quatre mètodes estàn disponibles en la classe derivada---------\n");

		Gat classtwo1 = new Gat();
		System.out.println(classtwo1.correr());
		System.out.println(classtwo1.correr("mamifer"));
		System.out.println(classtwo1.correr("mamifer", 35));
		System.out.println(classtwo1.correr("Gat", "maullits"));

	}

}
