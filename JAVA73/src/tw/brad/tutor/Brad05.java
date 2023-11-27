package tw.brad.tutor;

public class Brad05 {

	public static void main(String[] args) {
		int year = 2023;
		if (year % 4 == 0) { // 可以整除4
			if (year % 100 == 0) { // 整除100
				if (year % 400 == 0) { //整除400
					// 閏
					System.out.println("閏");
				} else {
					// 平
					System.out.println("平");
				}
			} else {
				// 閏
				System.out.println("閏");
			}

		} else {
			// 平
			System.out.println("平");
		}

		 // TODO:other --網路參考資料
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 閏
			System.out.println("ok");
		} else {
			// 平
			System.out.println("xx");
		}
	}
}
