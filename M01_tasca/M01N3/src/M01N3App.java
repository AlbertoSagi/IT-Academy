
public class M01N3App {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int aux = 0;
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = array[array.length-1]-aux;
			aux++;
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
			
	}

}
