package AlgoP2;

import java.util.ArrayList;
import java.util.HashMap;

public class GoogleDoc {
	private String title;
	String fileName;
	public ArrayList<User> users = new ArrayList<User>();
	private ArrayList<String> file = new ArrayList<String>();

	public HashMap<User, ArrayList<History>> map = new HashMap<>();

	// Constructor with a filepath as argument
	public GoogleDoc(String title, String fileName) {

		this.title = title;
		this.fileName = fileName;

	}

	// Constructor with an ArrayList of String as argument
	public GoogleDoc(String title, ArrayList<String> file) {

	}

	public ArrayList<String> getFile() {

		return file;

	}

	public ArrayList<User> getUsers() {
		return users;

	}

	public String getTitle() {
		return title;

	}

	public String toString() {
		return title;

	}

	public void addModif(User utilisateur, History modif) {
		if (!(map.containsKey(utilisateur))) {
			map.put(utilisateur, new ArrayList<History>());
		}
		map.get(utilisateur);
		map.get(utilisateur).add(0, modif);
	}

	public boolean restore(User user0) {
		
		map.get(user0).get(0);
		

		return false;

	}

}
