package command;

import request.Avio;

public class FrenaAvio implements Order {

	private Avio avio;

	public FrenaAvio(Avio avio) {
		this.avio = avio;
	}

	@Override
	public void execute() {
		avio.frenar();

	}

}
