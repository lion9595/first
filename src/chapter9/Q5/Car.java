package chapter9.Q5;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void start();
	public abstract void turnoff(); 
	
	public void washCar() {
		System.out.println("¼¼Â÷");
	}
	
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
	}

}
