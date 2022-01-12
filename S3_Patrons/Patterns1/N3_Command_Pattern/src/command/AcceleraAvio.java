package command;

import request.Avio;

public class AcceleraAvio implements Order {

	private Avio avio;

	public AcceleraAvio(Avio avio) {
		this.avio = avio;
	}

	@Override
	public void execute() {
		avio.accelerar();

	}

}
