package nivell1;

public class Main {

	public static void main(String[] args) {

		Cycle base1 = new Unicycle();// Generalitzaci�
		base1.setWheels(1);
		base1.ride();
		((Unicycle) base1).balance(); // Especialitzaci�

		System.out.println("----------------");

		Cycle base2 = new Bicycle();
		base2.setWheels(2);
		base2.ride();
		((Bicycle) base2).balance();

		System.out.println("----------------");

		Tricycle base3 = new Tricycle();
		base3.setWheels(3);
		base3.ride();

	}

}
