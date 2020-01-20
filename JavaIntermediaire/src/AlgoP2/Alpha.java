package AlgoP2;

public class Alpha {

	public static void main(String[] args) {
		
		System.out.println(alpha(20)); 
	}

	public static int alpha(int n) {
		if (n == 1)
			return 1;
		int y = 1;
		for (int i = 1; i <n; i++) {
			y *= n;
			System.out.println(n);
		}
		return y + 2 * alpha(n - 1);
	}
}
