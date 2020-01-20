package Collectionz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BoiteMusiques {

	public String[] tab;

	private ArrayList<Music> musique = new ArrayList<>();

	public void initialiser() {
		charge();
	}

	private void charge() {

		File file = new File(
				"C:\\Users\\morga\\Documents\\LEARN-JAVA\\JavaIntermediaire\\src\\Collectionz\\music.text");

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bf.readLine()) != null) {
				addMusic(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addMusic(String line) {
		String[] partie = line.split("/");
		musique.add(new Music(partie[0], partie[1]));
	}

	public ArrayList<Music> getMusique() {
		return musique;
	}

	public void setMusique(ArrayList<Music> musique) {
		this.musique = musique;
	}

}
