package Collectionz;

import java.util.Comparator;

public class CdComparator implements Comparator<CD> {

	@Override
	public int compare(CD cd1, CD cd2) {
		return cd1.getPrix().compareTo(cd2.getPrix());
	}

}
