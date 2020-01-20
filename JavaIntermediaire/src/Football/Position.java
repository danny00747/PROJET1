package Football;

public class Position extends Club implements Countryy{

	private String positionName;

	public Position(String name, int age, int height, String clubName, String country, String positionName) {
		
		super(name, age, height, clubName, country);
		this.positionName = positionName;
	}

	public Position(String name) {

		this.positionName = name;
	}

	public String getName() {
		return positionName;
	}

	public void setName(String name) {
		this.positionName = name;
	}

	@Override
	public String toString() {
		
		return super.toString() + "| ¨Position :" + positionName + "| ¨Pays :" + pays() + "]";
	}

	@Override
	public String pays() {
		String pays = "U.k";
		return pays;
	};
}
