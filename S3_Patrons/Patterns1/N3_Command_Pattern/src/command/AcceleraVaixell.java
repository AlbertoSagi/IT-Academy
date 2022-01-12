package command;

import request.Vaixell;

public class AcceleraVaixell implements Order {

	private Vaixell vaixell;

	public AcceleraVaixell(Vaixell vaixell) {
		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		vaixell.accelerar();

	}

}
