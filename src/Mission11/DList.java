package Mission11;


import java.util.LinkedList;

public class DList {

	LinkedList<Double> list;

	/**
	 * @pre
	 * @post a construit une liste initialement vide
	 */
	public DList() {
		list = new LinkedList<Double>();
	}

	/**
	 * @pre d!=null
	 * @post a ajout le Double d dans la liste
	 */
	public void add(Double d) {
		assert d != null;
		list.add(d);
	}

	/**
	 * @pre d!=null
	 * @post retourne true si d se trouvait dans la liste et false sinon a retire de
	 *       la liste toutes les instances de Double egales a d
	 */
	public boolean remove(Double d) {
		assert d != null;
		int i = list.indexOf(d);
		if (i >= 0) {
			Double d1 = list.remove(i);
			System.out.println(d1);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @pre d!=null
	 * @post retourne true si d se trouve dans la liste et false sinon
	 */
	public boolean contains(Double d) {
		return list.contains(d);
	}

	/**
	 * @pre -
	 * @post retourne le nombre de Double se trouvant dans la liste
	 */
	public int size() {
		return list.size();
	}
}
