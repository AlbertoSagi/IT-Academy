package N1F2;

public class MainFase2 {

	public static void main(String[] args) {

		I00_InterfazFuncional i01 = () -> {
			return 3.1415;
		};
		System.out.println(i01.getPiValue());

	}

}
