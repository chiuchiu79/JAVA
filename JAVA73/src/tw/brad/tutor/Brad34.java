package tw.brad.tutor;

public class Brad34 {

	// TODO: RunTimeException
	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c = { 1, 2, 3, 4 };

		System.out.println("Brad");

		// 如果程式可能會出現錯誤的地方，可以使用try抓錯誤
		try {
			System.out.println(a / b);// 異常算數
			System.out.println("---");
			System.out.println(c[4]); // 超出範圍
		} catch (ArrayIndexOutOfBoundsException e) { // 這裡給他catch
			System.out.println("XXXXX");
		} catch (ArithmeticException e) { // 這裡給他catch
			System.out.println("NO!!!");
		} catch (RuntimeException e) {
			System.out.println("error");
		}

		System.out.println("Finish");
	}
}
