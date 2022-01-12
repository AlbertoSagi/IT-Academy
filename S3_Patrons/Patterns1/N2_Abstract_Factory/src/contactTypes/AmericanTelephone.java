package contactTypes;

import abstractFactory.IContact;

public class AmericanTelephone implements IContact {

	@Override
	public String getValue() {
		return "+888";

	}

}
