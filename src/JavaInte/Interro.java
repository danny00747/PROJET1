package JavaInte;

import java.util.Arrays;

public class Interro {

	public static void main(String[] args) {
		double[][] m1 = { { 1.0, 2.0 }, { 1.0, 2.0 } };
		double[][] m2 = { { 1.0, 2.0 }, { 1.0, 2.0 } };
		System.out.println(identiques(m1, m2));
	}

	public static boolean identiques(double[][] m1, double[][] m2) {
		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return false;
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				if (m1[i][j] != m2[i][j])
					return false;
		return true;
	}

	public static boolean identiques2(double[][] m1, double[][] m2) {
		return Arrays.deepEquals(m1, m2);

	}

	public static int nChar(String s) {
		int carac[] = new int[s.length()];
		int index = 0;
		boolean isItThere = false;
		for (int i = 0; i < s.length(); i++) {
			int number = (int) (s.charAt(i));
			if (number <= 32 || number > 126) { // ASCII Table
				isItThere = true;
			}
			for (int j = 0; j < index && !isItThere; j++) {
				if (carac[j] == number) {
					isItThere = true;
				}
			}
			if (!isItThere) {
				carac[index] = number;
				index++;
			}
			isItThere = false;
		}
		return index;
	}

	// deuxième manière de le faire

	public static int nChar2(String s) {
		s = s.replace(" ", ""); // pour ne pas compter les espaces
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
		for (int i = 0; i < s.length(); i++) {
			isItThere[s.charAt(i)] = true;
		}
		int count = 0;
		for (int i = 0; i < isItThere.length; i++) {
			if (isItThere[i] == true) {
				count++;
			}
		}
		return count;
	}

	public static void divisor2(int n) {
		int maxi = 0;
		int nbDiv = 1;
		int nbDivMax = 0;
		for (int a = 1; a <= n; a++) {
			nbDiv = 1;
			for (int b = 1; b <= (a / 2); b++) {
				if ((a % b) == 0) {
					nbDiv++;
				}
			}
			if (nbDiv >= nbDivMax) {
				maxi = a;
				nbDivMax = nbDiv;
			}
		}
		System.out.println(maxi + " avec " + nbDivMax + " diviseurs");

	}

}
