package tw.brad.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad42 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/JDLE8331.JPG");
			FileOutputStream fout = new FileOutputStream("dir2/JDLE8331.JPG");

			int len;
			byte[] buf = new byte[4 * 1024];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
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
