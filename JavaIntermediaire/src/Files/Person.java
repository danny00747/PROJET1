package Files;

import java.text.ParseException;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalArgumentException {
		if (age < 15) {

			throw new IllegalArgumentException("Forbidden for under 18 ");
		}
		this.age = age;
	}

	public void setAge(String value) throws ParseException, IllegalArgumentException {
		try {
			this.age = Integer.parseInt(value);
			setAge(age); // can throw an IllegalArgumentException

		} catch (NumberFormatException e) {
			throw new ParseException("la valeur fournie est invalide", 31);

		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Nom : " + getFirstName() + "\n");
		sb.append("prenom : " + getLastName() + "\n");
		sb.append("age : " + getAge() + "\n");

		return sb.toString();
	}

}
