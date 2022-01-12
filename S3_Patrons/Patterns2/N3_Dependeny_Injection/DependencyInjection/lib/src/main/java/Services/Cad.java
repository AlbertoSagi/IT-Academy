package Services;

public class Cad implements IConverter {

	@Override
	public double converter(double price) {
		double priceCad = Math.round(((price * 1.42) * 100d) / 100d);
		return priceCad;
	}

	public String simbol() {
		return "CAD";
	}

}
