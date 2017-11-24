package utlis;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

	private static final int List = 0;

	public static void main(String[] args) {

	}

	public static int sum(List<Integer> list) {
		if (list == null) {
			return 0;
		}
		int sum = 0;
		for (Integer i : list) {
			if (i != null) {
				sum += i;
			}
		}
		return sum;
	}

	/*
	 * Pourquoi mettre s != null ? Cela va nous permettre de voir si tout marche
	 * même si s (notre chaine de caractère) est vide
	 */
	public static String emptyToNull(String s) {
		if (s != null && s.isEmpty())
			return s;

		return null;

	}

	public static List<Integer> filterEvenNumbers(List<Integer> integers) {

		/*
		 * Même principe ici que precemment. On passe par le null pour vérifier que tout
		 * les cas fonctionne. Voir MyUtilsTest
		 */
		List<Integer> listv2 = new ArrayList<Integer>();
		/*
		 * Je fais une nouvelle liste que je vais pourvoir modifier comme je le souhaite
		 * sans impacter notre liste de départ En effet listv2 contient totalement tous
		 * ce qui se trouve dans integers. La différence c'est que lors du retour au
		 * lieu de me renvoyé la liste integers avec le correctif que j'ai demandé ici
		 * les chiffres paires il va me renvoye les chiffre paires de cette liste sans
		 * modifié la liste integers grace a listv2 que nous avons créer precedemment.
		 * Et nous pouvons réutilisé list integers pour d'autre test mais pas listv2 car
		 * elle ne possede que les nombres paires de la liste integers
		 */
		if (integers != null) {
			for (int i = 0; integers.size() > i; i++) {
				if (integers.get(i) != null && integers.get(i) % 2 == 0) {
					listv2.add(integers.get(i));
				}
			}
		}
		return listv2;
	}

	public static List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		List<Float> listv2 = new ArrayList<Float>();
		float val;
		for (int i = 0; integers.size() > i; i++) {
			val = (float) (integers.get(i));
			listv2.add(val * val + 0.5F);
		}
		return listv2;
	}
}
