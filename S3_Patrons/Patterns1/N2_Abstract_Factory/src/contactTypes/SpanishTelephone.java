package contactTypes;

import abstractFactory.IContact;

public class SpanishTelephone implements IContact {

	@Override
	public String getValue() {
		return "+34";

	}

}
