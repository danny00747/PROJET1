package Collectionz;

import java.util.ArrayList;
import java.util.Collections;

import Collectionz.Music.Sorted;

public class BoiteMusiquesTest {

	public static void main(String[] args) {

		BoiteMusiques bm = new BoiteMusiques();
		bm.initialiser();
		ArrayList<Music> musique = bm.getMusique();
		


		Music.setSort(Sorted.AUTHOR);

		System.out.println("Avant sort " + bm.getMusique());

		Collections.sort(musique, new MusicComparator1()); // Song Comparator
		// Collections.sort(musique, new MusicComparator()); // Author Comparator
		// Collections.sort(musique); // No Comparator Used ! -> Comparable

		System.out.println("Après sort " + bm.getMusique());

	}

}
