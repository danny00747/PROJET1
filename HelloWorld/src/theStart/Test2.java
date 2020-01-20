package theStart;

public class Test2 {
	
	static double weightedMean(int X[], int W[], int n) {
		int sum = 0, numWeight = 0;

		for (int i = 0; i < n; i++) {
			numWeight +=  X[i] * W[i];
			sum = sum + W[i];
		}

		return (double) (numWeight) / sum;
	}

	
	public static void main(String args[]) {
		
		int X[] = { 20, 10, 20 };
		int W[] = { 25, 15, 20 };

		
		int n = X.length;
		int m = W.length;

		
		if (n == m)
			System.out.println(weightedMean(X, W, n));
		else
			System.out.println("-1");

	}

}
