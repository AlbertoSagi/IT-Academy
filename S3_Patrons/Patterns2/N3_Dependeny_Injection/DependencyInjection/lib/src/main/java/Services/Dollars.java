package Services;

public class Dollars implements IConverter {

	@Override
	public double converter(double price) {
		double priceDollar = Math.round(((price * 1.13) * 100d) / 100d);
		return priceDollar;
	}

	public String simbol() {
		return "$";
	}

}
