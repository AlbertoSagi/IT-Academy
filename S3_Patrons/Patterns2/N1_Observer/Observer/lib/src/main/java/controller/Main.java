package controller;

import observers.Agency1;
import observers.Agency2;
import observers.Agency3;
import subject.Subject;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new Agency1(subject);
		new Agency2(subject);
		new Agency3(subject);

		System.out.println("La Bolsa sube");
		subject.setState("sube");
		System.out.println("La Bolsa baja");
		subject.setState("baja");

	}

}
