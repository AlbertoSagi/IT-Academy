package observers;

import subject.Subject;

public class Agency1 extends Observer {

	public Agency1(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agency1: La bolsa " + subject.getState());

	}

}
