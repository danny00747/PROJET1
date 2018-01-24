package theStart;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.print("1");
			}
			System.out.println("+");
		}
		//System.out.println("+");
	}
}
// }

/*
 * for (int i = 0; i < 4; i++) { for (int j = 0; j <= i; j++) {
 * System.out.print("0"); } System.out.println("*"); }
 */

// for (int j =3-i; j >=1; j--)

/*
 * 
 */