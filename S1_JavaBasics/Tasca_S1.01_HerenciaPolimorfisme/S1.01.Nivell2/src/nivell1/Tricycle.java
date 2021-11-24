package nivell1;

public class Tricycle extends Cycle {

	@Override
	public void ride() {
		System.out.println("Aquest tricycle té " + this.getWheels() + " rodes.");
	}
}
