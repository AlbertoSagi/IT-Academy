package command;

import request.Cotxe;

public class FrenaCotxe implements Order {

	private Cotxe cotxe;

	public FrenaCotxe(Cotxe cotxe) {
		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		cotxe.frenar();

	}

}
