package command;

import request.Bicicleta;

public class AcceleraBicicleta implements Order {

	private Bicicleta bicicleta;

	public AcceleraBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	@Override
	public void execute() {
		bicicleta.accelerar();

	}

}
