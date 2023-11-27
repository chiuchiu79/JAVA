package tw.brad.tutor;

public class Brad01 {

	public static void main(String[] args) {
		byte var1; // [a-zA-Z$_][a-zA-Z0-9$_]*
		byte $$$, $_$ = 123, 變數 = -12; // 宣告多個變數逗號隔開
		System.out.println($_$);
		System.out.println(變數);
		

		byte var2 = 1, var3 = 2;
		int var4 = var2 + var3; // byte, short, int => int
		byte a = 127;
		a++;
		a += 3; //指派運算，並非用+去運算;會喪失精準性
		System.out.println(a);
	}
}
