package subject;

import java.util.ArrayList;
import java.util.List;

import observers.Observer;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyAllOservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	private void notifyAllOservers() {
		for (Observer observer : observers) {
			observer.update();
		}

	}

}
