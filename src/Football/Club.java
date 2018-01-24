package Football;

public class Club extends Player {

	private String clubName;
	private String country;

	

	public Club(String name, int age, int height, String clubName, String country) {
		super(name, age, height);
		this.clubName = clubName;
		this.country = country;
	}

	public Club() {

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String name) {
		this.clubName = name;
	}

	@Override
	public String toString() {

		return super.toString()  + "| Club :" + clubName + "| Country :" + country;
	}

}
