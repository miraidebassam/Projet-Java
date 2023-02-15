package observer;


import window.MainWindow1;

public abstract class Observer {
	protected MainWindow1 subject;
	public abstract void update();
}
