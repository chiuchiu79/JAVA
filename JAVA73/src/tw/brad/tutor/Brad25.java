package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad25 extends JFrame {

	private int a;

	public Brad25() {
		super("Brad25");
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);

		MyMouseListener listener = new MyMouseListener();
		panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad25();
	}

	private void m1() {
		System.out.println("m1():" + a);
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			a++;
			System.out.println("Click");
		}

		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
		}
	}
}
