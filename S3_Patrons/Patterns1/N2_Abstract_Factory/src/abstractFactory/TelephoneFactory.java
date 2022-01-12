package abstractFactory;

import contactTypes.AmericanTelephone;
import contactTypes.BritishTelephone;
import contactTypes.SpanishTelephone;

public class TelephoneFactory extends AbstractFactory {

	@Override
	public IContact getContact(String contactType) {
		if (contactType.equalsIgnoreCase("American Telephone")) {
			return new AmericanTelephone();
		} else if (contactType.equalsIgnoreCase("British Telephone")) {
			return new BritishTelephone();
		} else if (contactType.equalsIgnoreCase("Spanish Telephone")) {
			return new SpanishTelephone();
		}
		return null;
	}

}
