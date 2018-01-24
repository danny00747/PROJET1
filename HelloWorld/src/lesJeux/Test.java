package lesJeux;

public class Test {

	public static void main(String[] args) {
		//System.out.println(contains('s'));
		//System.out.println(contains1("j"));
		int n = 8;
		int sum = 0;
		String b = new String ("daniel");
		String a = new String ("daniel");
		
		
		if ( a.equals(b)) {
			System.out.println("true-vrai");
		}else {
			System.out.println("faux");
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				// System.out.println(sum);
			}
			// System.out.println(sum);
		}
		// System.out.println(sum);

	}

	public static boolean contains(char s) {
		char[] sb = { 'd', 'a', 'n' };
		for (int i = 0; i < sb.length; i++) {

			if (s == sb[i]) {
				return true;
			}
		}
		return false;

	}

	public static boolean contains1(String s1) {
		String[] string = { "d", "a", "n" };
		for (int i = 0; i < string.length; i++) {

			if (s1 == string[i]) {
				return true;
			}
		}
		return false;

	}
}
