package command;

import request.Avio;

public class ArrancaAvio implements Order {

	private Avio avio;

	public ArrancaAvio(Avio avio) {
		this.avio = avio;
	}

	@Override
	public void execute() {
		avio.arrancar();

	}

}
