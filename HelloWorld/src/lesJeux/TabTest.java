package lesJeux;

import java.util.Arrays;

public class TabTest {

	public static void main(String[] args) {
		int[] tab = { 10, 20, 30 };
		int[] tab1 = { 100, 200, 300 };
		int[][] tab2 = { { 10, 20, 30 }, { 10, 20, 300 } };
		double[][] tab3 = new double[2][2];
		tab3[0][1] = 3.2; 

		System.out.println(tab3[0][1]);
		System.out.println(sum(tab, tab1));
		System.out.println(Arrays.toString(sum2(tab2)));
		System.out.println();
		sum3(tab);

	}

	public static int sum(int[] a, int[] b) {
		int sum = 0;
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			sum += a[i] + b[i];
		}
		return sum;
	}

	public static int[][] sum2(int[][] tab2) {
		
		int[][] c = new int[tab2.length][tab2.length];
		for (int i = 0; i < tab2.length-1; i++) {
			for (int j = 0; j < tab2[i].length-1; j++) {
				c[i][j] = tab2[i][j];
			}
			
		}
		return c;
	}

	public static void sum3(int[] n) {
		for (int i : n) {
			System.out.println(i);
		}

	}

}
