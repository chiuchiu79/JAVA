package tw.brad.tutor;

import java.util.Scanner;

public class Brad02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 從鍵盤輸入
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int r1 = a + b;
		int r2 = a - b;
		int r3 = a * b;
		int r4 = a / b;
		int r5 = a % b;

		System.out.printf("%d + %d = %d\n", a, b, r1);
		System.out.printf("%d - %d = %d\n", a, b, r2);
		System.out.printf("%d * %d = %d\n", a, b, r3);
		System.out.printf("%d / %d = %d ... %d\n", a, b, r4, r5);

	}
}
