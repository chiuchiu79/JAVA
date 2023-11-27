package tw.brad.tutor;

public class Brad24 {

	public static void main(String[] args) {
		Brad241 obj1 = new Brad242();
	}
}

//抽象類別 abstract 無任何實作
abstract class Brad241 {
	void m1() {
	}
	abstract void m2();
}

class Brad242 extends Brad241 {
	void m2() {
	}
}

class Brad243 extends Brad241 {
	void m2() {
	}
}