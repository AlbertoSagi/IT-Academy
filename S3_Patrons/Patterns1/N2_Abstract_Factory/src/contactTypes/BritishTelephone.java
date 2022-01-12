package contactTypes;

import abstractFactory.IContact;

public class BritishTelephone implements IContact {

	@Override
	public String getValue() {
		return "+555 ";

	}

}
