package command;

import request.Bicicleta;

public class ArrancaBicicleta implements Order {

	private Bicicleta bicicleta;

	public ArrancaBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	@Override
	public void execute() {
		bicicleta.arrancar();

	}

}
