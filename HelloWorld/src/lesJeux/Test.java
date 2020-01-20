package lesJeux;

public class Test {

	public static void calcSum_array(int arr[], int n, int m) {
		int sum = 0;
		int sum_array[] = new int[n];

		// calc 1st m/2 + 1 element
		// for 1st window
		for (int i = 0; i < m / 2 + 1; i++)
			sum += arr[i];
		sum_array[0] = sum;

		// use sliding window to
		// calculate rest of sum_array
		for (int i = 1; i < n; i++) {
			if (i - (m / 2) - 1 >= 0)
				sum -= arr[i - (m / 2) - 1];
			if (i + (m / 2) < n)
				sum += arr[i + (m / 2)];
			sum_array[i] = sum;
		}

		// print sum_array
		for (int i = 0; i < n; i++)
			System.out.print(sum_array[i] + " ");
	}

	// Driver program
	public static void main(String[] args) {
		int arr[] = {2, 3, 0, 4, 9, 0, 3 };
		int m = 5;
		int n = arr.length;
		calcSum_array(arr, n, m);
	}
}
