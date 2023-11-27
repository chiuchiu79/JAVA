package tw.brad.classes;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener { // Listen
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;

	public GuessNumber() {
		// super();
		super("猜數字遊戲"); // 第一道敘述句 初始化
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new BorderLayout());

		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();

		input.setFont(new Font(null, Font.BOLD + Font.ITALIC, 24));
		log.setFont(new Font(null, Font.BOLD, 24));

		guess.addActionListener(this); // 按鈕委託自己本人

		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);

		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // TODO:EXIT_ON_CLOSE => defined in WindowConstants

		initGame();
		// System.out.println(answer);
	}

	private void initGame() {
		answer = createAnswer(3);
		counter = 0;
		log.setText("");
	}

	private String createAnswer(int d) {
		int num = 10;
		int[] poker = new int[num];
		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}

		for (int i = num - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			// poker[rand] <-> poker[i];
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < d; i++) {
			sb.append(poker[i]);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		new GuessNumber();
	}

	@Override // TODO:implements ActionListener，當Listen了後，事件會被觸發，會自動呼叫
	public void actionPerformed(ActionEvent e) {
		counter++;
		String inputText = input.getText();
		String result = checkAB(inputText);
		// log.setText(String.format("%s => %s", inputText, result)); => setText 會整個覆蓋掉
		log.append(String.format("%s => %s\n", inputText, result));
		input.setText("");

		if (result.equals("3A0B")) {
			JOptionPane.showMessageDialog(null, "恭喜老爺");
		} else if (counter == 0) {
			JOptionPane.showMessageDialog(null, "Loser:" + answer);
		}
	}

	// log 猜測過程
	private String checkAB(String g) {
		int a, b;
		a = b = 0;
		for (int i = 0; i < g.length(); i++) {
			if (g.charAt(i) == answer.charAt(i)) {
				a++;
			} else if (answer.indexOf(g.charAt(i)) >= 0) {
				b++;
			}
		}
		// 回報猜測過程
		return String.format("%dA%dB", a, b);
	}
}
