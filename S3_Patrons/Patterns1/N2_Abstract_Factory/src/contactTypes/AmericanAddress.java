package contactTypes;

import abstractFactory.IContact;

public class AmericanAddress implements IContact {

	@Override
	public String getValue() {
		return "American Address";

	}

}
