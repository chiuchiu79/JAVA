package tw.brad.classes;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	// TODO：多點連成線
	// HashMap：點； < >：元素型別
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;

	public MyPanel() {
		setBackground(Color.YELLOW);

		lines = new LinkedList<>();
		recycle = new LinkedList<>();

		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4)); // 筆畫粗細

		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i - 1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
	}

	// 寫成內部類別，方便存取
	private class MyMouseListener extends MouseAdapter {
		@Override
		// press 點取
		public void mousePressed(MouseEvent e) {
			recycle.clear();

			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());

			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);

			lines.add(line);
		}

		@Override
		// drag 抓取
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point); // 在lines裡面選取最新的那一條line
			repaint();

		}
	}

	public void clear() {
		lines.clear();
		repaint();
	}

	public void undo() {
		if (lines.size() > 0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}

	public void redo() {
		if (recycle.size() > 0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
}