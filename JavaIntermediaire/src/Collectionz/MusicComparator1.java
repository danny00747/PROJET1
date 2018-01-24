package Collectionz;

import java.util.Comparator;

public class MusicComparator1 implements Comparator<Music> {
	
		@Override
		public int compare(Music music1, Music music2) {
			return music1.getSong().compareTo(music2.getSong());
			
		}
		
	}


