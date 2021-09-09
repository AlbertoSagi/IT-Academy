
public class M01N1F2App {

	public static void main(String[] args) {
		
		final int any = 1948;
		int count = 0;
		
		System.out.println("Anys de traspàs des de 1948 fins 1985:");
		
		for (int i=any; i<=1985; i=i+4) {
			System.out.print(i + " ");
			count++;
		}
		
		System.out.println("\n");
		System.out.println("Nombre d'anys de traspàs des de 1948 fins 1985: "+ count);

	}

}
