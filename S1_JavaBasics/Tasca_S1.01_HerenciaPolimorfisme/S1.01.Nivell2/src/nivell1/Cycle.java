package nivell1;

public class Cycle {

	private int wheels;

	public void ride() {
		System.out.println("Aquest cycle té " + this.getWheels() + " rodes.");
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
