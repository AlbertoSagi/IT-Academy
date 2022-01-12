package command;

import request.Vaixell;

public class ArrancaVaixell implements Order {

	private Vaixell vaixell;

	public ArrancaVaixell(Vaixell vaixell) {
		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		vaixell.arrancar();

	}

}
