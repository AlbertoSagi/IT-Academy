package contactTypes;

import abstractFactory.IContact;

public class BritishAddress implements IContact {

	@Override
	public String getValue() {
		return "British Address";

	}

}
