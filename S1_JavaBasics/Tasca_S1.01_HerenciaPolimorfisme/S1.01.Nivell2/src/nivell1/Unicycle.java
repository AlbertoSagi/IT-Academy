package nivell1;

public class Unicycle extends Cycle {

	@Override
	public void ride() {
		System.out.println("Aquest Uniycle t� " + this.getWheels() + " rodes.");
	}

	public void balance() {
		System.out.println("Balance a Unicycle");
	}
}
