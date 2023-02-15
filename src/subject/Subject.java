package subject;

import java.awt.Color;
import java.util.ArrayList;

import observer.Observer;

public class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	//Le state est de type color
	private Color state;
	
	
	public Color getState() {
		return state; 
	}
	
	public void setState(Color state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
