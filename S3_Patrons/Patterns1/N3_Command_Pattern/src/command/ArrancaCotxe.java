package command;

import request.Cotxe;

public class ArrancaCotxe implements Order {

	private Cotxe cotxe;

	public ArrancaCotxe(Cotxe cotxe) {
		this.cotxe = cotxe;
	}

	@Override
	public void execute() {
		cotxe.arrancar();

	}

}
