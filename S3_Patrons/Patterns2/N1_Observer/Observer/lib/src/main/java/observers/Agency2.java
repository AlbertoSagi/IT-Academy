package observers;

import subject.Subject;

public class Agency2 extends Observer {

	public Agency2(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Agency2: La bolsa " + subject.getState());

	}

}
