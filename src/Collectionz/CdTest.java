package Collectionz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CdTest {
	public static void main(String[] args) {

		ArrayList<CD> list = new ArrayList<CD>();

		CD cd = new CD("Emi", "Not afr", 11);

		list.add(new CD("Eminem", "Not afraid", 25));
		list.add(new CD("Eminem", "Im afraid", 25));
		list.add(new CD("Beyonce", "Single lady", 19));
		list.add(new CD("Drake", "Hotline", 12));
		list.add(new CD("Timbland", "Apologize", 73));
		list.add(new CD("Florida", "My house", 125));
		list.add(cd);
	

		System.err.println("Avant le tri : " + "\n");
		/*
		 * for (CD cdd : list) { System.out.println(cdd); }
		 */
		Iterator<CD> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println();

		Collections.sort(list);
	

		System.err.println("Après le tri : " + "\n");

		/*
		 * for (CD cddd : list) { System.out.println(cddd); }
		 */

		Iterator<CD> its = list.iterator();
		its = list.iterator();
		while (its.hasNext())
			System.out.println(its.next());

	}
}
