package tw.brad.tutor;

public class Brad99 {

	public static void main(String[] args) {
		final int START = 2;
		final int ROWS = 2;
		final int COLS = 4;

		for (int k = 0; k < ROWS; k++) { // 重複row
			for (int j = 1; j <= 9; j++) {
				for (int i = START; i < START + COLS; i++) {
					int newi = i + k * COLS;// 因為有四個column，所以要乘以4
					int r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("-----");
		}
	}
}
