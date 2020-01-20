package AlgoP1;

import java.util.Arrays;

public class LSINF1103 {

	/**
	 * @author : Daniel Olivier, Maxime Wets, Matthieu Leclercq
	 * @version : 1.2
	 */

	/**
	 * SYNTHESE DE TOUS LES ALGORITHMES DE TRI ETC. VUS AU COURS
	 */

	public static void main(String[] args) {

		int[] A = { 5, 9, 0, 6, 9, 2, 8, 4, 1, 7, 10 };
		System.out.println("avant sorting : " + Arrays.toString(A) + "\n");
		insertionSort(A);
		System.out.println("après sorting : " + Arrays.toString(A));
	}

	/********************************************************************************
	 * ALGORITHMES UTILITAIRES
	 ********************************************************************************/

	/**
	 * @cours : 2
	 * @nom : ArrayMax
	 * @pre : inputArray != null
	 * @post : retourne la valeur maximale dans inputArray
	 * @complexité : Θ(n)
	 */
	public static int ArrayMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	/**
	 * @cours : 3
	 * @nom : ArrayFirstNegative
	 * @pre : A un tableau de n entiers (n > 0)
	 * @post : l’indice du premier entier négatif dans A
	 * @complexité : Θ(n)
	 */
	public static int ArrayFirstNegative(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0)
				return i;
		}
		return -1;
	}

	/**
	 * @cours : 3
	 * @nom : equalPair
	 * @pre : A un tableau de n + 1 entiers (n > 0)
	 * @post : Une paire d’éléments égaux dans A (null, si pas d’éléments égaux)
	 * @complexité : O(n^2)
	 */
	public static int[] equalPair(int[] A) {
		for (int i = 0 + 1; i < A.length; i++) {
			int current = A[i];
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] == current)
					return new int[] { current, A[j] };
			}
		}
		return null;
	}

	/**
	 * @cours : 3
	 * @nom : RECHERCHE DICHOTOMIQUE
	 * @pre : A != null && low > 0 && high < A.length && A est un tableau trié;
	 * @post : retourne la clé si elle est dans le tableau, sinon -1;
	 * @complexité : O(log n)
	 */
	public static int binarySearch(int key, int[] A, int low, int high) {

		// si la clé n'est pas dans le tableau
		if (low > high)
			return -1;
		int middle = (low + high) / 2;
		// si la clé est au milieu du tableau
		if (A[middle] == key)
			return middle;
		// si
		if (A[middle] < key)
			return binarySearch(key, A, low, middle - 1);
		else
			return binarySearch(key, A, middle + 1, high);
	} // binarySearch()

	/**
	 * @cours: 7
	 * @nom : TOURS DE HANOI
	 * @pre : n
	 * @post : affiche combien de disques il faut déplacer de quel côté
	 * @complexité : Θ(2^n)
	 */
	public static void moves(int n, boolean left) {

		if (n == 0)
			return;
		moves(n - 1, !left);
		if (left)
			System.out.println(n + " left");
		else
			System.out.println(n + " right");
		moves(n - 1, !left);
	}

	/********************************************************************************
	 * ALGORITHMES DE TRI
	 ********************************************************************************/

	/**
	 * @cours : 5
	 * @nom : Tri à bulle
	 * @pre : Un tableau A de n éléments
	 * @post :Le tableau A trié en ordre croissant
	 * @complexité : Worst case : O(n^2) , Best case : O(n)
	 * @adaptatif : non
	 * @Stabilité : oui
	 */
	public static void bubbleSort(int[] A) {

		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	/**
	 * @cours : 5
	 * @nom : Tri par selection
	 * @pre : Un tableau A de n éléments
	 * @post :Le tableau A trié en ordre croissant
	 * @complexité : Θ(n²)
	 * @adaptatif : non
	 * @Stabilité : non
	 */
	public static void selectionSort(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int min = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[min])
					min = j;
			} // for (j)
			if (min != i) {
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;
			}
		}
	} // selectionSort() : Pas meilleur que BubbleSortsauf si on veut minimiser le
		// nombre d’échanges.

	/**
	 * @cours : 5
	 * @nom : Tri par insertion
	 * @pre : A != null;
	 * @post : Le tableau A trié en ordre croissant
	 * @complexité : O(n^2)
	 * @adaptatif : oui
	 * @Stabilité : oui
	 */
	public static void insertionSort(int[] A) {

		int i, j;
		// parcourir tout le tableau
		for (i = 1; i < A.length; i++) {
			int key = A[i];
			// si on trouve un élément plus grand que la clé, on le déplace et on décale le
			// tableau
			for (j = i; j > 0 && A[j - 1] > key; j--)
				A[j] = A[j - 1];

			// changer la clé à chaque itération
			A[j] = key;
		} // for (i)
	} // insertionSort() : Utile comme algo de base mais reste quadratique donc
		// clairement pas le meilleur.

	/**
	 * @nom : Tri en temps linaire
	 * @pre : A != null;
	 * @post : retourne le tableau A trié;
	 * @complexité : Θ(n) mais complexité spatiale potentiellement immense => max(A)
	 */
	public static int[] linearSort(int[] A) {

		// calculer max
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max)
				max = A[i];
		} // for (i)

		int[] B = new int[max + 1];
		for (int i = 0; i < A.length; i++) {
			B[A[i]]++;
		}
		int j = 0;
		// retranscrire B dans A
		for (int i = 0; i < B.length; i++) {
			while (B[i] > 0) {
				A[j++] = i;
				B[i]--;
			} // while ()
		} // for (i)
		return A;
	} // linearSort()

	/********************************************************************************
	 * ALGORITHMES DE TRI PAR RECURSION
	 ********************************************************************************/

	/**
	 * @cours : 8
	 * @nom : Tri par fusion
	 * @pre : A != null && low > 0 && high < A.length
	 * @post : retourne A, le tableau trié par ordre croissant
	 * @complexité : Θ(nlog(n))
	 * @adaptatif : non
	 * @Stabilité : oui
	 */
	public static void mergeSort(int[] A, int low, int high) {
		if (low >= high)
			return;
		int middle = (low + high) / 2;
		mergeSort(A, low, middle);
		mergeSort(A, middle + 1, high);
		merge(A, low, middle, high);
	} // mergeSort() :
		// Pour trier de large collections problème de mémoire (lié à un problème de
		// pile),
		// donc arrêter récursion sur tableau de petite taille et trier celui-ci par
		// insertion

	/**
	 * METHODE AUXILIAIRE DE MERGESORT
	 * 
	 * @pre : A[low->middle] trié && A[middle+1->high] trié;
	 * @post : fusionne les deux sous tableaux triés en un;
	 */
	private static void merge(int[] A, int low, int middle, int high) {

		int[] aux = new int[A.length];
		for (int i : A) {
			aux[i] = A[i];
		}

		// fusionner les deux sous-tableaux
		int i = low, j = middle + 1, k = 0;
		while (i <= middle && j <= high) {
			if (A[i] <= A[j])
				aux[k++] = A[i++];
			else
				aux[k++] = A[j++];
		}
		// recopier les éléments restants dans aux
		while (i <= middle)
			aux[k++] = A[i++];
		while (j <= high)
			aux[k++] = A[j++];
		// recopier aux dans A
		i = low;
		k = 0;
		while (i <= high)
			A[i++] = aux[k++];

	} // merge()

	/**
	 * PUISSANCE D'UN NOMBRE (RECURSIF)
	 * 
	 * @pre : n >= 0;
	 * @post : retourne x^n;
	 * @complexité :
	 */
	public static long puiss(int x, int n) {

		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return puiss(x * x, n / 2);
		else
			return x * puiss(x * x, (n - 1) / 2);
	}

	/**
	 * ALGORITHME D'EUCLIDE
	 * 
	 * @pre : p > 0 && q > 0;
	 * @post : calcule le plus grand commmun diviseur de p et q;
	 * @complexité = Θ(log(n))
	 */
	public static int pgcd_euclide(int p, int q) {

		// cas de base
		if (q == 0)
			return p;
		// récursivité
		return pgcd_euclide(q, p % q);
	}

	/**
	 * algorithme d'Euclide en une seule ligne (ça sert à rien mais c'est stylé)
	 */
	public static int euclide_bg(int p, int q) {
		return (q == 0) ? p : euclide_bg(q, p % q);
	}

	/********************************************************************************
	 * ALGORITHMES DE TP
	 ********************************************************************************/

	/**
	 * KADANE
	 * 
	 * @Tp : 3
	 * @pre : A != null;
	 * @post : calcule la plus grande somme consécutive du tableau;
	 * @complexité : Θ(n)
	 */
	public static void maxSumKadane(int[] A) {

		int maxEndingHere = A[0];
		int maxSoFar = A[0];

		for (int i : A) {
			maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		} // for (i)
	} // maxSumKadane()

	/**
	 * SOMME DES N PREMIERS ELEMENTS
	 * 
	 * @Tp : 6
	 * @pre : A != null && n > 0;
	 * @post : retourne la somme des n premiers elements du tableau;
	 * @complexité : Θ(n)
	 */
	public static int sumFirstElements(int[] A, int n) {

		if (n == 1)
			return A[0];
		return A[n - 1] + sumFirstElements(A, n - 1);
	} // sumFirstElements()

	/**
	 * @nom : Fibonacci
	 * @Tp : 6
	 * @complexité : Θ(n)
	 */

	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1)) // base cases
			return number;
		else
			// recursion step
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	/**
	 * @nom : Alpha
	 * @Tp : révison
	 * @complexité : Θ(n^2)
	 */

	public static int alpha(int n) {
		if (n == 1)
			return 1;
		int y = 1;
		for (int i = 1; i < n; i++) {
			y *= n;
		}
		return y + 2 * alpha(n - 1);
	}

} // class SyntheseAlgo
