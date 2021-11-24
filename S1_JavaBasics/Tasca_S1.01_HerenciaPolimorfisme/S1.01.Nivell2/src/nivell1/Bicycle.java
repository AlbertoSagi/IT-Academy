package nivell1;

public class Bicycle extends Cycle {

	@Override
	public void ride() {
		System.out.println("Aquest biycle té " + this.getWheels() + " rodes.");
	}

	public void balance() {
		System.out.println("Balance a Bicycle");
	}
}
