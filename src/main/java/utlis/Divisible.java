package utlis;

import java.util.ArrayList;
import java.util.List;

public class Divisible {
//	public static void main(String[] args) {
//		
//		if (Float.parseFloat(args[0]) % 3 && Float.parseFloat(args[0]) != null) {
//			System.out.println("Divisible par 3");
//		} else if (Float.parseFloat(args[0]) % 5 && Float.parseFloat(args[0]) != null) {
//			System.out.println("Divisible par 5");
//		} else if (Float.parseFloat(args[0]) % 3 && Float.parseFloat(args[0]) % 5 && Float.parseFloat(args[0]) != null) {
//			System.out.print("Divisible par 5 et 3");
//		}
//		else
//			System.out.println("Non divisible");
//	}
	private static final int List = 0;

	public static void main(String[] args) {

	}
	
	public static List<Integer> nombre(List<Integer> liste) {
		
		List<Integer> listev2 = new ArrayList<Integer>();
		//Creation d'une liste vierge pour les test unitaire
		
		if (liste != null) {
			return null;
		}
		else for (int i = 0; liste.size() > i; i++) {
			if (liste.get(i) % 3 && liste.get(i) != null) {
				listev2.add(liste.get(i));
			} else if (liste.get(i) % 5 && liste.get(i) != null) {
				listev2.add(liste.get(i));
			} else if (liste.get(i) % 3 && liste.get(i) % 5 && liste.get(i) != null) {
				listev2.add(liste.get(i));
			}
		}
		return listev;
	}
	
}
