package Files;

public class PlayerFiles implements Comparable<PlayerFiles> {
	private String name;

	public PlayerFiles(String file) {
		this.name = file;
	}

	public PlayerFiles() {
		// TODO Auto-generated constructor stub
	}

	public String getPlayer() {
		return name;
	}

	public void setPlayer(String name) {
		this.name = name;

	}

	@Override
	public int compareTo(PlayerFiles o) {
		return this.getPlayer().compareTo(o.getPlayer());

	}

	@Override
	public String toString() {
		return name;
	}
}
