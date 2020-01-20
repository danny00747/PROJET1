package Football;

public class Main2 {

	public static void main(String[] args) {
		double[] table = { 1, 2, 3, 4, 5, 6, 7 };
		double sum = 0;
		double sumMax = 0;
		for (int i = 0; i < table.length; i++) {
			sum = sum + table[i];
			if (sum < 0) {
				sum = 0;
			}
			sumMax = Math.max(sum, sumMax);
		}
		System.out.println(sumMax);

	}
}
