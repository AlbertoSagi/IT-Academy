package contactTypes;

import abstractFactory.IContact;

public class SpanishAddress implements IContact {

	@Override
	public String getValue() {
		return "Spanish Address";
	}

}
