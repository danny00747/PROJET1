package Mission8;

public class DessinEPL {
	public static void main(String[] args) {
		Shape shape1 = new Triangle(256, 100, 318, 40, 117, 90, true, "black"); // bras gauche compas
		Shape shape2 = new Triangle(256, 100, 40, 318, -27, 90, true, "blue"); // bras droit compas
		Shape shape3 = new Triangle(359, 136, 30, 180, -40, 90, true, "black"); // pioche
		Shape shape4 = new Triangle(116, 168, 50, 60, 220, 90, true, "blue"); // pointe marteau
		Shape shape5 = new Rectangle(213, 384, 30, 272, 230, true, "black"); // manche pioche
		Shape shape6 = new Rectangle(299, 384, 280, 30, 220, true, "blue"); // manche marteau
		Shape shape7 = new Rectangle(116, 168, 90, 50, 130, true, "blue"); // masse marteau
		Figure figure = new Figure(shape1, shape2, shape3, shape4, shape5, shape6, shape7); // cr?e une figure compos?e
																							// de plusieurs figures

		int[] min1 = shape1.minXY();
		int[] min2 = shape2.minXY();
		int[] min3 = shape3.minXY();
		int[] min4 = shape4.minXY();
		int[] min5 = shape5.minXY();
		int[] min6 = shape6.minXY();
		int[] min7 = shape7.minXY();

		int[] max1 = shape1.maxXY();
		int[] max2 = shape2.maxXY();
		int[] max3 = shape3.maxXY();
		int[] max4 = shape4.maxXY();
		int[] max5 = shape5.maxXY();
		int[] max6 = shape6.maxXY();
		int[] max7 = shape7.maxXY();

		int minX = Math.min(
				Math.min(Math.min(Math.min(Math.min(Math.min(min1[0], min2[0]), min3[0]), min4[0]), min5[0]), min6[0]),
				min7[0]);
		int minY = Math.min(
				Math.min(Math.min(Math.min(Math.min(Math.min(min1[1], min2[1]), min3[1]), min4[1]), min5[1]), min6[1]),
				min7[1]);
		int maxX = Math.max(
				Math.max(Math.max(Math.max(Math.max(Math.max(max1[0], max2[0]), max3[0]), max4[0]), max5[0]), max6[0]),
				max7[0]);
		int maxY = Math.max(
				Math.max(Math.max(Math.max(Math.max(Math.max(max1[1], max2[1]), max3[1]), max4[1]), max5[1]), max6[1]),
				max7[1]);

		DrawPanel panel = new DrawPanel(figure, minX, maxX, minY, maxY);
	}
}
