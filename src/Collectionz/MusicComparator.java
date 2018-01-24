package Collectionz;

import java.util.Comparator;

public class MusicComparator implements Comparator<Music> {

	@Override
	public int compare(Music music1, Music music2) {
		return music1.getAuthor().compareTo(music2.getAuthor());

	}

}
