package theStart;

import java.util.Arrays;

public class Tableaux {

	public static void main(String[] args) {

		tryy(3);

		int[] tab = { 11, 20, 30, 40, 50};
		String ab = "dan";
		decaleDroite(tab);
		
		System.out.println(Arrays.toString(tab) + " helloOOOOOOO");
		System.out.println();
		System.out.println();
		System.out.println(ab.length() + " helloOOOOOOO");
		System.out.println(Integer.MIN_VALUE);
		int[] tab3 = { 10, 20, 30, 40, 50 };
		String[] strg = null;

		strg = new String[] { "dan", "oli", " dab" };

		int[][] tab2 = { { 10, 29, 40, 22 }, { 30, 34, 45, 59 } };
		int[] tab1 = new int[5];
		tab1[0] = 1;
		tab1[1] = 2;
		tab1[2] = 5;
		// tab = tab1;

		display(tab);

		// darrays(tab);

		// System.out.println(tab1.length);

		int a[] = { 5, 12, 10, 6, 15 };

		System.out.println("\n\nLargest Number is " + max_rec(a, a.length - 1));
		System.out.println(max(a));

	}

	public static int max_rec(int[] a, int n) {
		if (n > 0) {
			return Math.max(a[n], max_rec(a, n - 1));
		} else {
			return a[0];
		}
	}

	public static int max(int a[]) {
		int b[] = new int[a.length - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		if (a.length == 1)
			return a[0];
		else {

			if (a[a.length - 1] > b[b.length - 1]) {
				b[b.length - 1] = a[a.length - 1];
			}
		}
		return max(b);
	}

	public static void display(int[] tab) {

		for (int i = 0; i < tab.length - 2; i++) {
			tab[i] = tab[i] + 1;
			System.out.println(tab.toString());
		}

		System.out.println(Integer.valueOf(tab[0]) + Integer.valueOf(tab[2]));

	}

	public static void newtab(int[] newt) {

		System.out.println(newt[0] + newt[1]);
		System.out.println(newt[0] + newt[2]);
	}

	public static void darrays(int[][] dim) {

		for (int i = 0; i < dim.length; i++) {
			for (int j = 0; j < dim[i].length; j++) {
				System.out.print(dim[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(dim[0][1]);

	}

	public static void advancedLoop(int[] n) {
		for (int i : n) {

			System.out.println(i);

		}
	}

	public static int[] oppose(int[] v) {
		assert v != null;
		int[] a = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			a[i] = -v[i];
		}
		return a;
	}

	public static int[] somme(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];

		}
		return c;
	}

	public static int[] somme2(int[] x, int[] y) {
		int[] z = somme(x, y);
		for (int i = 0; i < z.length; i++) {
			z[i] = z[i] + x[i];
		}
		return z;
	}

	public static boolean isEven(int[] e) {
		for (int i : e) {
			if (i % 2 == 0) {
				return true;
			}
		}
		return false;

	}

	public static void tryy(int a) {
		int b = try1(a) * 2;
		System.out.println(b);
	}

	public static int try1(int a) {

		return a;
	}
	
	public static void decaleDroite(int[] tab) {
		   
		  for(int i = tab.length - 1; i > 0; i--) {
		      tab[i] = tab[i - 1]; 
		  }
		     tab[0] = 0;
		}

}
