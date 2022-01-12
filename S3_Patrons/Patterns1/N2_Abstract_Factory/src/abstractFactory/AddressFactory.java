package abstractFactory;

import contactTypes.AmericanAddress;
import contactTypes.BritishAddress;
import contactTypes.SpanishAddress;

public class AddressFactory extends AbstractFactory {

	@Override
	public IContact getContact(String contactType) {
		if (contactType.equalsIgnoreCase("American Address")) {
			return new AmericanAddress();
		} else if (contactType.equalsIgnoreCase("British Address")) {
			return new BritishAddress();
		} else if (contactType.equalsIgnoreCase("Spanish Address")) {
			return new SpanishAddress();
		}
		return null;
	}

}
