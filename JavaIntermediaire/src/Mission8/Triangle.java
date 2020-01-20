package Mission8;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle implements Shape {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private boolean fill;
	private String color;

	public Triangle(int a, int b, int cote1, int cote2, int angle1, int angle2, boolean fill, String color) {
		this.x1 = a;
		this.y1 = b;
		this.x2 = x1 + (int) (cote1 * Math.cos((angle1 * Math.PI) / 180));
		this.y2 = y1 + (int) (cote1 * Math.sin((angle1 * Math.PI) / 180));
		this.x3 = x1 + (int) (cote2 * Math.cos(((angle1 + angle2) * Math.PI) / 180));
		this.y3 = y1 + (int) (cote2 * Math.sin(((angle1 + angle2) * Math.PI) / 180));
		this.fill = fill;
		this.color = color;
	}

	public void draw(Graphics g) {
		Segment seg1 = new Segment(x1, y1, x2, y2);
		if (color.equals("blue")) {
			g.setColor(Color.BLUE);
		} else if (color.equals("green")) {
			g.setColor(Color.GREEN);
		} else if (color.equals("red")) {
			g.setColor(Color.RED);
		} else if (color.equals("white")) {
			g.setColor(Color.WHITE);
		} else if (color.equals("orange")) {
			g.setColor(Color.ORANGE);
		} else if (color.equals("yellow")) {
			g.setColor(Color.YELLOW);
		} else if (color.equals("cyan")) {
			g.setColor(Color.CYAN);
		} else if (color.equals("black")) {
			g.setColor(Color.MAGENTA);
		} else {
			g.setColor(Color.BLACK);
		}
		seg1.draw(g);
		Segment seg2 = new Segment(x1, y1, x3, y3);
		seg2.draw(g);
		Segment seg3 = new Segment(x2, y2, x3, y3);
		seg3.draw(g);
		if (fill) {
			int[] x = new int[3];
			x[0] = x1;
			x[1] = x2;
			x[2] = x3;
			int[] y = new int[3];
			y[0] = y1;
			y[1] = y2;
			y[2] = y3;
			g.fillPolygon(x, y, 3);
		}
	}

	public int[] minXY() {
		int[] min = new int[2];
		int minx = Math.min(x1, x2);
		int miny = Math.min(y1, y2);
		min[1] = Math.min(miny, y3);
		min[0] = Math.min(minx, x3);
		return min;
	}

	public int[] maxXY() {
		int[] max = new int[2];
		int maxx = Math.max(x1, x2);
		int maxy = Math.max(y1, y2);
		max[1] = Math.max(maxy, y3);
		max[0] = Math.max(maxx, x3);
		return max;
	}
}
