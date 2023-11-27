package tw.brad.tutor;

import tw.brad.classes.Bike;
import tw.brad.classes.Scooter;

public class Brad15 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Scooter s1 = new Scooter();
		b1.upSpeed();
		s1.changeGear(3);
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());

	}

}
