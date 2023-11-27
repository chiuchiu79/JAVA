package tw.brad.classes;

public class Bike {
	protected double speed;

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.4;
	}

	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}

	public double getSpeed() {
		return speed;
	}
}
