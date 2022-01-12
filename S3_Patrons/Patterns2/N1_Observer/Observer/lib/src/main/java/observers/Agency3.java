package observers;

import subject.Subject;

public class Agency3 extends Observer {

	public Agency3(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agency3: La bolsa " + subject.getState());

	}

}
