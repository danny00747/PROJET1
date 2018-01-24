package Mission8;

public class Dessin {
	public static void main(String args[]) {

		Shape shape = new Triangle(134, 232, 156, 165, 33, 92, true, "blue");
		int[] min = shape.minXY();
		int[] max = shape.maxXY();
		DrawPanel panel = new DrawPanel(shape, min[0], max[0], min[1], max[1]);

		Shape shape1 = new Equilateral(245, 254, 142, 34, true, "black");
		int[] min1 = shape1.minXY();
		int[] max1 = shape1.maxXY();
		DrawPanel panel1 = new DrawPanel(shape1, min1[0], max1[0], min1[1], max1[1]);

		Shape shape2 = new Rectangle(99, 34, 738, 324, 10, true, "blue");
		int[] min2 = shape2.minXY();
		int[] max2 = shape2.maxXY();
		DrawPanel panel2 = new DrawPanel(shape2, min2[0], max2[0], min2[1], max2[1]);

		Shape shape3 = new Carre(990, 324, 526, 450, true, "black");
		int[] min3 = shape3.minXY();
		int[] max3 = shape3.maxXY();
		DrawPanel panel3 = new DrawPanel(shape3, min3[0], max3[0], min3[1], max3[1]);

	}
}
