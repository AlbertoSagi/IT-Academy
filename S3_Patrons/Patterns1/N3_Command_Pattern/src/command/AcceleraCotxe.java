package command;

import request.Cotxe;

public class AcceleraCotxe implements Order {

	private Cotxe cotxe;

	public AcceleraCotxe(Cotxe cotxe) {
		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		cotxe.accelerar();

	}

}
