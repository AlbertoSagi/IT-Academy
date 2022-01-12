package Services;

public class Pounds implements IConverter {

	@Override
	public double converter(double price) {
		double pricePounds = Math.round(((price * 0.83) * 100d) / 100d);
		return pricePounds;

	}

	public String simbol() {
		return "£";
	}

}
