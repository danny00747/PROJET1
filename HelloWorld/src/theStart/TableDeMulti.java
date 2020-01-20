package theStart;

public class TableDeMulti {

	public static void main(String[] args) {
		display(1);
		System.out.println();
		display(2);
		System.out.println();
		display(3);
		System.out.println();
		display(4);
		System.out.println();
		display(5);
		System.out.println();
		display(6);
		System.out.println();
		display(7);
		System.out.println();
		display(8);
		System.out.println();
		display(9);
		System.out.println();
		display(10);
		System.out.println();

		// affiche(4);
	}

	public static void display(int n) {
		for (int a = 1; a <= 10; a++) {
			System.out.print(a * n);
		}
	}

	public static void affiche(int n) {
		for (int a = 10; a >= 1; a--) {
			System.out.print(a * n);
		}
	}

}
