package tw.brad.tutor;

public class Brad09 {

	public static void main(String[] args) {
		int p0, p1, p2, p3, p4, p5, p6;
		p0 = p1 = p2 = p3 = p4 = p4 = p5 = p6 = 0;

		for (int i = 0; i < 1000; i++) {
			// 產生一個介於 1 到 6 之間的隨機整數，模擬擲骰子的結果
			// int強制轉換成整數會捨去小數點，將結果轉換為介於 0 和 5 之間的整數。
			// 為了將範圍調整為 1 到 6（包括 6），所以再加上 1
			int point = (int) (Math.random() * 6) + 1;

			// 使用 switch 敘述根據擲骰子的點數更新相應的次數變數
			switch (point) {
			case 1:
				p1++;
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			default:
				p0++;
			}
		}
		if (p0 == 0) {
			System.out.printf("1點出現幾次%d次\n", p1);
			System.out.printf("2點出現幾次%d次\n", p2);
			System.out.printf("3點出現幾次%d次\n", p3);
			System.out.printf("4點出現幾次%d次\n", p4);
			System.out.printf("5點出現幾次%d次\n", p5);
			System.out.printf("6點出現幾次%d次\n", p6);
		} else {
			System.out.println("ERROR:" + p0);
		}
	}

}
