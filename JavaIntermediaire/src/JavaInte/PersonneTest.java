package JavaInte;

import JavaInte.Personne.Homme;

public class PersonneTest {

	public static void main(String[] args) {
		Personne name = new Personne("dannyç", "olivi");
		Personne name1 = new Personne("dannyç", "olivii");
		Personne name2 = new Personne("dan", "oli");
		Personne namez = new Personne("dan", "oli");
		Personne name7 = new ClassB("dan", "oli", "3rd");
		@SuppressWarnings("unused")
		Personne name3 = new Personne(25);
		String name4 = name.fulltitle("je suis ");

		name.setMiddle("ok");
		System.out.println(name.getMiddle());

				name.getNom().equals(name1.getNom());

		/*
		 * instanceof method
		 */

		if (name instanceof ClassB) {

			System.out.println("vrai");
		} else {
			System.out.println("false");
		}

		/*
		 * try catch methode
		 */

		try {
			name.setAge(100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * name.setNom("dan"); name2.setNom("oli");
		 */
		// name.setAge(32);

		Personne.Homme.affichage();

		System.out.println(name.getAge());
		System.out.println(Personne.nbr);
		System.out.println(name1.getNom());
		System.out.println(name2.getNom());
		
		System.out.println(Personne.MAXHEARS);
		System.out.println(name4);
		System.out.println(name2.fulltitle());
		System.out.println(name.equals(name1));
		System.out.println(Personne.getnombresDesPersonnes());
		
			
		


	}

}
