package theStart;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;

		int c = a >= 5 ? a : a == 5 ? b : 1;
		System.out.println(c);

		/*
		 * if (a >= 5) {
		 *  c = a;
		 *} else if (a == 5) {
		 * c = b; 
		 * } else { 
		 * c = 1;
		 * 
		 * } System.out.println(c);
		 */
	}
}

