package Mission8;

public class PinkFloyd {
	public static void main() {
		Shape[] shape = { new Carre(1, 1, 512, 0, true, "black"), new Equilateral(256, 100, 300, 60, false, "white"),
				new Equilateral(256, 101, 298, 60, false, "white"),
				new Triangle(206, 186, 93, 105, -10, 15, false, "white"),
				new Triangle(207, 186, 91, 103, -10, 15, false, "white"),
				new Rectangle(206, 187, 300, 3, 160, true, "white"),
				new Triangle(297, 169, 220, 223, 10, 2, true, "red"),
				new Triangle(297, 169, 223, 5, 12, 48, true, "red"),
				new Triangle(299, 173, 220, 223, 11, 2, true, "orange"),
				new Triangle(299, 173, 223, 5, 13, 47, true, "orange"),
				new Triangle(301, 177, 220, 223, 12, 2, true, "yellow"),
				new Triangle(301, 177, 223, 5, 14, 45, true, "yellow"),
				new Triangle(303, 181, 220, 223, 13, 2, true, "green"),
				new Triangle(303, 181, 223, 5, 15, 43, true, "green"),
				new Triangle(305, 185, 220, 223, 14, 2, true, "cyan"),
				new Triangle(305, 185, 223, 5, 16, 41, true, "cyan"),
				new Triangle(307, 189, 220, 223, 15, 2, true, "magenta"),
				new Triangle(307, 189, 223, 5, 17, 39, true, "magenta") };

		Figure figure = new Figure(shape);

		DrawPanel panel = new DrawPanel(figure);
	}
}
