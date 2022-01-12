package Services;

public class ConverterFactory {
	public enum TypeConverter {
		Dollars, Pounds, Cad
	}

	public static IConverter create(TypeConverter type) {
		IConverter iconverter;
		switch (type) {
		case Dollars: {
			iconverter = new Dollars();
			break;
		}
		case Pounds: {
			iconverter = new Pounds();
			break;
		}
		case Cad: {
			iconverter = new Cad();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return iconverter;

	}

}
