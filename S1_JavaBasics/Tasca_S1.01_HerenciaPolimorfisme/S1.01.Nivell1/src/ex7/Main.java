package ex7;

import ex6.Amphibian;
import ex6.Frog;

public class Main {

	public static void main(String[] args) {
		Amphibian rana = new Frog();

		System.out.println(rana.menjar());
		System.out.println(rana.moure());
		System.out.println(rana.respirar());
		System.out.println(rana.saltar()); // Es demostra que dona error

	}

}
