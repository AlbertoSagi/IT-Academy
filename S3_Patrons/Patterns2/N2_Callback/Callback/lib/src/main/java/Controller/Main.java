package Controller;

public class Main {

	public static void main(String[] args) {

		FormaPago pago1 = new Tarjeta();
		TiendaZapatos.ComprobarPago(pago1);

		FormaPago pago2 = new Paypal();
		TiendaZapatos.ComprobarPago(pago2);

		FormaPago pago3 = new Transfer();
		TiendaZapatos.ComprobarPago(pago3);

	}

}
