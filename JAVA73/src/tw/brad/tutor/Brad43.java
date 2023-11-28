package tw.brad.tutor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad43 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			BufferedInputStream fin = new BufferedInputStream(new FileInputStream("dir1/JDLE8331.JPG"));

			BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("dir2/JDLE8331.JPG"));

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
