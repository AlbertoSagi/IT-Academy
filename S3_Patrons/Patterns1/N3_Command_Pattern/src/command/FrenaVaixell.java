package command;

import request.Vaixell;

public class FrenaVaixell implements Order {

	private Vaixell vaixell;

	public FrenaVaixell(Vaixell vaixell) {
		this.vaixell = vaixell;
	}

	@Override
	public void execute() {
		vaixell.frenar();

	}

}
