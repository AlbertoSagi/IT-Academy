
public class M01N2App {

	public static void main(String[] args) {
		
		double doub = 3.1416;
		int num;
		float num2;
		String text;
		
		System.out.println(doub + " double"); 
				
		num = (int) doub;
		System.out.println(num + " int");
		
		num2 = (float) doub;
		System.out.println(num2 + " float");
		
		text = Double.toString(doub);
		System.out.println(text + " string");
		
	}

}
