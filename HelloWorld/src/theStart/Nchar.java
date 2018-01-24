package theStart;

public class Nchar {

	public static void main(String[] args) {
		String s = "abc ";
		System.out.println(unique(s));
	}
	public static int unique (String s) {
        int carac [] = new int [s.length()];
        int indice = 0;
        boolean dedans = false;
        for (int a = 0; a < s.length(); a++) {
            int numero = (int) (s.charAt(a));
            if (numero <= 32 || numero > 126) { //Ascii Table 
                dedans = true;
            }
            for (int b = 0; b < indice && !dedans; b++) {
                if (carac[b] == numero) {
                    dedans = true;
                }
            }
            if (!dedans) {
                carac[indice] = numero;
                indice++;
            }
            dedans = false;
        }
        return indice;
    }
	
	public static int countUniqueCharacters(String input) {
		input = input.replace(" ", "");
	    boolean[] isItThere = new boolean[Character.MAX_VALUE];
	    for (int i = 0; i < input.length(); i++) {
	        isItThere[input.charAt(i)] = true;
	    }
	    int count = 0;
	    for (int i = 0; i < isItThere.length; i++) {
	        if (isItThere[i] == true){
	            count++;
	        }
	    }
	    return count;
	}
	
 }

