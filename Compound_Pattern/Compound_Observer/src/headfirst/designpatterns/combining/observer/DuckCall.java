package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;

public class DuckCall implements Quackable {
	Observable observable;
	private ArrayList<Observer> observers;

	public DuckCall() {
		//observable = new Observable(this);
		observers = new ArrayList<>();
	}
 
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		observers.add(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		for(Observer observer : observers){
			observer.update(this);
		}
	}
 
	public String toString() {
		return "Duck Call";
	}
}
