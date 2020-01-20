package Football;

public class Main {

	private static double[] tableau = null;

	public static void main(String[] args) {

		tableau = new double[230];
		int t = 0;

		for (double a = 1; a <= 1000; a += 1) {

			int n = (int) (1000 * a*a);
			double[] tab = new double[n];

			for (int i = 0; i < tab.length; i++) {
				int nombre = ((int) (Math.random() * 10)) + 1;
				double positif = Math.random();

				if (positif < 0.5) {
					tab[i] = nombre;
				} else {
					tab[i] = 0 - nombre;
				}
			}

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
			}

			long debut = System.currentTimeMillis();
			maxContSum(tab);
			long fin = System.currentTimeMillis() - debut;
			tableau[t] =  fin;
			System.out.print(" n = " + n + ", \"maxCountSum\" : " + tableau[t]);

			t++;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
			}

			long debutK = System.currentTimeMillis();
			Kadane(tab);
			long finK =System.currentTimeMillis() - debutK;
			tableau[t] =  finK;
			System.out.println(", \"Kadane\" : " + tableau[t]);

			t++;
		}
	}

	public static double maxContSum(double[] table) {
		double temp;
		double sum = 0;
		for (int i = 0; i < table.length; i++) {
			temp = 0;
			for (int j = i; j < table.length; j++) {
				temp += table[j];
				sum = Math.max(sum, temp);
			}
		}
		return sum;

	}

	public static double Kadane(double[] table) {
		double sum=0;
		 double sumMax=0; 
		for(int i=0 ; i<table.length ; i++){
		    sum = sum+table[i] ;
		     if(sum<0){
		         sum=0 ;
		     }
		    sumMax = Math.max(sum,sumMax);
		} return sumMax ;

	}

}
