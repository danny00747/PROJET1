package JavaInte;

public class ClassBTest {

	public static void main(String[] args) {

		String[] strg1 = { "dan", "oli", "niyo" };
		Personne name = new ClassB("d", "ol ");
		Personne name1 = new Personne("d", "ol2 ");
		Personne name2 = null;

		ClassB myname = new ClassB("dannya", "olivier");
		Personne myname1 = new ClassB("dannya");
		ClassB myname5 = new ClassB("dannya");
		;

		// ClassB myname2 = new ClassB();

		myname.setAge(23);

		System.out.println(myname.getNom());
		System.out.println(myname.getAge());
		System.out.println(myname.fulltitle("dd "));
		System.out.println(myname1.fulltitle());
		System.out.println();

		if (name1 instanceof ClassB) {
			// nam = (ClassB) myname;
			// System.out.println(nam.getPrenom());
			System.out.println("vrai");
		} else {
			System.out.println("false");

		}

		System.out.println();

		name = (ClassB) myname;
		// name1 = name;
		if (name2 instanceof Personne && myname instanceof ClassB) {

			System.out.println(name.getPrenom());
			System.out.println(name2.getPrenom());
			System.out.println(myname.getPrenom());
			System.out.println("vrai");

		} else {
			System.out.println("faux1");
		
			System.out.println(myname5.equals(myname1));
			System.out.println(myname1.fulltitle());
			
			
		}

	}


}
