package command;

import request.Bicicleta;

public class FrenaBicicleta implements Order {

	private Bicicleta bicicleta;

	public FrenaBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	@Override
	public void execute() {
		bicicleta.frenar();

	}

}
