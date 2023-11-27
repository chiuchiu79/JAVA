package tw.brad.tutor;

import java.io.FileOutputStream;

public class Brad38 {

	public static void main(String[] args) {
		try {
			String mesg = "hi\n"; // 把原有的清除,再寫上新內容
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt", true);
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
