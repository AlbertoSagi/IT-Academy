package abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String typeOfContact) {

		if (typeOfContact.equalsIgnoreCase("TELEPHONE")) {
			return new TelephoneFactory();
		} else {
			return new AddressFactory();
		}

	}

}
