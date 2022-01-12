package abstractFactory;

import agenda.Agenda;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		// Example1: Factory Telephone
		// get contact factory
		AbstractFactory typeFactory = FactoryProducer.getFactory("TELEPHONE");

		// get an object of SpanishTelephone
		IContact contact1 = typeFactory.getContact("spanish telephone");
		// Add contact1 to Agenda
		Agenda.contactos.add(contact1);

		// get an object of BrithisTelephone
		IContact contact2 = typeFactory.getContact("british telephone");
		// Add contact2 to Agenda
		Agenda.contactos.add(contact2);

		// Example2: Factory Address
		// get contact factory
		AbstractFactory typeFactory2 = FactoryProducer.getFactory("address");

		IContact contact3 = typeFactory2.getContact("spanish address");
		Agenda.contactos.add(contact3);

		IContact contact4 = typeFactory2.getContact("british address");
		Agenda.contactos.add(contact4);

		for (IContact contacts : Agenda.contactos) {
			System.out.println(contacts.getValue()); // call method getValue() of each IContact
		}

	}

}
