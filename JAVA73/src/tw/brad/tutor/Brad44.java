package tw.brad.tutor;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.brad.classes.Student;

public class Brad44 {

	public static void main(String[] args) {
		Student s1 = new Student(86, 45, 67);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		System.out.println("-----");
		Student s2 = new Student(87, 47, 37);
		System.out.println(s2.sum());
		System.out.println(s2.avg());

		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("dir1/s1.brad")));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
