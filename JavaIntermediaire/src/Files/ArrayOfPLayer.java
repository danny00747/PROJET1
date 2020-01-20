package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class ArrayOfPLayer {

	File file = new File("C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Files\\barca.text");

	String line;

	private ArrayList<PlayerFiles> musique = new ArrayList<PlayerFiles>();

	public void initialiserr() {
		charger();
	}

	private void charger() {

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			while ((line = bf.readLine()) != null) {
				addMusic(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String addMusic(String line) {
		musique.add(new PlayerFiles(line));
		return line;

	}

	public ArrayList<PlayerFiles> getMusique() {
		return musique;
	}

	public void setMusique(ArrayList<PlayerFiles> musique) {
		this.musique = musique;

	}
}
