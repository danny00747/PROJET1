package Mission8;

import java.awt.Graphics;

public class Figure implements Shape {
	private Shape[] shape;

	public Figure(Shape[] shape) {
		this.shape = shape;
	}

	public Figure(Shape shape1, Shape shape2, Shape shape3, Shape shape4, Shape shape5, Shape shape6, Shape shape7) {
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		for (int i = 0; i < shape.length; i++) {
			shape[i].draw(g);
		}
	}

	public int[] minXY() {
		int[][] min = new int[shape.length][2];
		for (int i = 0; i < shape.length; i++) {
			int[] minXY = shape[i].minXY();
			min[i][0] = minXY[0];
			min[i][1] = minXY[1];
		}
		int[] minXY = new int[2];
		int minX = min[0][0];
		int minY = min[0][1];
		for (int i = 1; i < shape.length; i++) {
			minX = Math.min(minX, min[i][0]);
			minY = Math.min(minY, min[i][1]);
		}
		minXY[0] = minX;
		minXY[1] = minY;
		return minXY;
	}

	public int[] maxXY() {
		int[][] max = new int[shape.length][2];
		for (int i = 0; i < shape.length; i++) {
			int[] maxXY = shape[i].maxXY();
			max[i][0] = maxXY[0];
			max[i][1] = maxXY[1];
		}
		int[] maxXY = new int[2];
		int maxX = max[0][0];
		int maxY = max[0][1];
		for (int i = 1; i < shape.length; i++) {
			maxX = Math.max(maxX, max[i][0]);
			maxY = Math.max(maxY, max[i][1]);
		}
		maxXY[0] = maxX;
		maxXY[1] = maxY;
		return maxXY;
	}

}
