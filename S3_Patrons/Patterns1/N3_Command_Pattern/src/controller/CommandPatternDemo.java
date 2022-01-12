package controller;

import broker.Broker;
import command.AcceleraCotxe;
import command.AcceleraVaixell;
import command.ArrancaCotxe;
import command.ArrancaVaixell;
import command.FrenaCotxe;
import command.FrenaVaixell;
import request.Cotxe;
import request.Vaixell;

public class CommandPatternDemo {

	public static void main(String[] args) {

		Cotxe cotxe = new Cotxe();

		ArrancaCotxe arrancaCotxeOrder = new ArrancaCotxe(cotxe);
		AcceleraCotxe acceleraCotxeOrder = new AcceleraCotxe(cotxe);
		FrenaCotxe frenaCotxeOrder = new FrenaCotxe(cotxe);

		Broker broker = new Broker();
		broker.takeOrder(arrancaCotxeOrder);
		broker.takeOrder(acceleraCotxeOrder);
		broker.takeOrder(frenaCotxeOrder);

		Vaixell vaixell = new Vaixell();

		ArrancaVaixell arrancaVaixellOrder = new ArrancaVaixell(vaixell);
		AcceleraVaixell acceleraVaixellOrder = new AcceleraVaixell(vaixell);
		FrenaVaixell frenaVaixellOrder = new FrenaVaixell(vaixell);

		broker.takeOrder(arrancaVaixellOrder);
		broker.takeOrder(acceleraVaixellOrder);
		broker.takeOrder(frenaVaixellOrder);

		broker.placeOrders();

	}

}
