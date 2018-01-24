package Heritage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Dictionary {

	private Word[] dictionary;

	public Dictionary(String filename) {

		BufferedReader inFile;

		try {
			inFile = new BufferedReader(new FileReader(filename));
			String string = inFile.readLine();
			int b = Integer.parseInt(string);
			dictionary = new Word[b];
			for (int i = 0; string != null; i++) {
				string = inFile.readLine();
				String[] tab = string.split(",");
				try {
					int a = Integer.parseInt(tab[1]);
					dictionary[i] = new Word(tab[0], a);
				} catch (NumberFormatException e) {
					System.out.print("Erreur d'occurence" + e.getMessage());
					System.out.print("Pas d'erreur d'occurence! bravo" + e.getMessage());
				}
				string = inFile.readLine();
			}
			inFile.close();
		} catch (IOException e) {
			System.out.print("Erreur Exception dans le lecteur de fichier" + e.getMessage());
			System.exit(-1);
		}
	}

	/**
	 * @pre
	 * @post retourne le tableau tab dans l'ordre alphab?tique
	 */
	public void alpha() {
		Arrays.sort(dictionary);
	}
}
