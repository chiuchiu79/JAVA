package tw.brad.tutor;

public class lab03 {

	public static void main(String[] args) {
		int[] p = new int[50];

		for (int i = 0; i < 100; i++) {
			int point = (int) (Math.random() * 49) + 1;// 1~6
			if (point < 1 || point > 49) {
				p[0]++;
			} else {
				p[point]++;
			}
		}
		if (p[0] == 0) {
			for (int i = 1; i <= 49; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		} else {
			System.out.println("ERROR:" + p[0]);
		}
	}
}
