package tw.brad.tutor;

public class Brad10 {

	public static void main(String[] args) {
		int[] p = new int[7];

		for (int i = 0; i < 100000; i++) {
			int point = (int) (Math.random() * 9) + 1;// 1~6,7、8、9
			if (point < 1 || point > 9) {
				p[0]++;
			} else {
				p[point > 6 ? point - 3 : point]++; // 將 789 的次數算到456裡
			}
		}
		if (p[0] == 0) {
			for (int i = 1; i <= 6; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		} else {
			System.out.println("ERROR:" + p[0]);
		}
	}
}
