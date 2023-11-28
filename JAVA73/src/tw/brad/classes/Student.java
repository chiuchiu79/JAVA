package tw.brad.classes;

import java.io.Serializable;

// TODO:Serializable 序列化
public class Student implements Serializable {
	private int ch, eng, math;

	public Student(int ch, int eng, int math) {
		this.ch = ch;
		this.eng = eng;
		this.math = math;
	}

	public int sum() {
		return ch + eng + math;
	}

	public double avg() {
		return sum() / 3.0;
	}
}
