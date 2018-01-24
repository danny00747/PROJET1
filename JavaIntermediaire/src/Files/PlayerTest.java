package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PlayerTest {

	public static void main(String[] args) {

		mainz();
	}

	public static void mainz() {

		File file = new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca.text");
		
		
		ArrayOfPLayer bm = new ArrayOfPLayer();
		bm.initialiserr();
		ArrayList<PlayerFiles> musique = bm.getMusique();

		System.out.println("Avant sort " + bm.getMusique());

		Collections.sort(musique);

		System.out.println("Après sort " + bm.getMusique());
		
	

		try (
				BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {

			bf.write(musique + "");
			bf.newLine();

		} catch (IOException e) {
			System.out.println("cant read the file");
			e.printStackTrace();
		}

	}

}
