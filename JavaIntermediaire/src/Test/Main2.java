package Test;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		int[] A = { 5, 8, 0, 6, 9, 2, 3, 4, 1, 7, 10 };
		
		System.out.println("avant sorting :" + Arrays.toString(A) + "\n" );
		selectionSort(A);
		System.out.println("après sorting :" + Arrays.toString(A));
	
	}
		

	

	public static void selectionSort(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min])
					min = j;
			} // for (j)
			if (min != i) {
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;
			}
		}
	}

}
