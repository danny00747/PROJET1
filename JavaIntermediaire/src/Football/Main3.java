package Football;

public class Main3 {

	public static void main(String[] args) {
		main2(5, 10);
	}
	    public static double maxContSum(double [] table){
	        double sum=0.0;
	        for(int i=0;i<=table.length-1;i++){
	            double tmp=0.0;
	            for(int j=i;j<=table.length-1;j++){
	                tmp=tmp+table[j];
	                sum=Math.max(sum,tmp);
	            }
	        }
	        return sum;
	    }	
	
		public static double Kadane(double [] table){
	        double sum=0.0;
	        double current=0.0;
	        for(int i=0;i<table.length;i++){   
	            if(sum<0){
	                sum=0;
	            }
	            sum=sum+table[i];
	            current=Math.max(current,sum);
	        }
	        return current;
	    }

	    public static int signe(){
	        if(Math.random()*100>=50){
	            return -1;
	        }
	        else{
	            return 1;
	        }
	    }
	    public static void main2 (int n,int taille){ 
	        double [] table = new double [taille];
	        for(int j=0;j<table.length;j++){
	            table[j]=Math.random()*100*signe();
	        }
	        for(int i=0;i<n;i++){
	            long debut=System.nanoTime();
	            Kadane(table);
	            long fin = System.nanoTime();
	            long calcul =fin - debut;
	            System.out.println(i +"\t"+ calcul);
	        }
	        System.out.println();
	        System.out.println("maxContSum");
	        for(int k=0;k<n;k++){
	            long debut=System.nanoTime();
	            maxContSum(table);
	            long fin = System.nanoTime();
	            long calcul =fin - debut;
	            System.out.println(k +"\t"+ calcul);
	        }
	    }
	

	}


