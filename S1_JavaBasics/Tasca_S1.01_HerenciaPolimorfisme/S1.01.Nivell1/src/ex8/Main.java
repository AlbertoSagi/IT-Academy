package ex8;

public class Main {

	public static void main(String[] args) {
		Amphibian rana = new Frog();

		System.out.println(rana.menjar());
		System.out.println(rana.moure());
		System.out.println(rana.respirar());

		Frog rana2 = new Frog();

		System.out.println(rana2.menjar());
		System.out.println(rana2.moure());
		System.out.println(rana2.respirar());
		System.out.println(rana2.saltar());

	}

}
