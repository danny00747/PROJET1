package Collectionz;

public class Music implements Comparable<Music> {

	enum Sorted {
		AUTHOR, SONG;
	}

	private String song;
	private String author;
	private static Sorted sort = null;

	
	public Music(String song, String author) {
		this.song = song;
		this.author = author;
	}

	public Music(String author) {

	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static Sorted getSort() {
		return sort;
	}

	public static void setSort(Sorted sort) {
		Music.sort = sort;
	}

	@Override
	public String toString() {

		return Music.sort == Sorted.AUTHOR ? author : song;
	}

	@Override
	public int compareTo(Music other) {
		

		return Music.sort == Sorted.AUTHOR ? author.compareTo(other.getAuthor()) : song.compareTo(other.getSong());

	}
}
