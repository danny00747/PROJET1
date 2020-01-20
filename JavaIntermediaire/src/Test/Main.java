package Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> file = new ArrayList<String>();
		file.add("La peur est le chemin vers le côté obscur \n");
		file.add("La peur mène à la colère \n");
		file.add("La colère mène à la haine \n");
		file.add("La haine mène à la souffrance. \n");

		// System.out.print(file.size());

		String p = "aa";
		String s = "Daanielaarraa?rraa";
		String s3 = "012345";
		
		
		
		
		System.out.println( (s.length() - s.replace(p, "").length()) / p.length());

		for (int i = 0; i < s3.length(); i++) {
			// System.out.println(s3.charAt( i));
			int c = Character.getNumericValue(s3.charAt(i));
			// System.out.println(c);
		}

	}

	public static boolean containsChar(String s1, String s2) {
		for (char c : s1.toCharArray()) {
			System.out.println(c);
			if (s2.indexOf(c) < 0)
				return false;
		}
		for (char c : s2.toCharArray()) {
			if (s1.indexOf(c) < 0)
				return false;
		}
		return true;
	}

}
