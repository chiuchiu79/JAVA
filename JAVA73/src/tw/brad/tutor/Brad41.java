package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad41 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/IMG_4184.JPG");
			FileOutputStream fout = new FileOutputStream("dir2/IMG_4184.JPG");

			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}

			fout.flush();
			fout.close();
			fin.close();
			System.out.println("finish:" + (System.currentTimeMillis() - start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
